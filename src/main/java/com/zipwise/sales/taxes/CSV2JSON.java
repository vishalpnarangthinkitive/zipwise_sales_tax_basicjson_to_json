package com.zipwise.sales.taxes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.zipwise.sales.taxes.entity.InputObject;
import com.zipwise.sales.taxes.entity.TaxDetails;
import com.zipwise.sales.taxes.entity.TaxTable;
import com.zipwise.sales.taxes.entity.ZipwiseSalesTax;

public class CSV2JSON {

    public static void main(String[] args) throws Exception {
        // all csv files added just using CA files for now will also import other states taxes as well
        // also note files starting with TAXRATES_ZIP5 have to be updated with excel formulas and headers
        File input = new File("input_zipcode_files_statewise/CA-SalesTax Rates.csv");
        File output = new File("output_zipcode_files_statewise/CAZip.json");

        CsvSchema csvSchema = CsvSchema.builder().setUseHeader(true).build();
        CsvMapper csvMapper = new CsvMapper();

        List<Object> readAll = csvMapper.readerFor(Map.class).with(csvSchema).readValues(input).readAll();

        ObjectMapper mapper = new ObjectMapper();
        List<ZipwiseSalesTax> zipwiseSalesTaxes = new ArrayList<ZipwiseSalesTax>();

        for(Object object : readAll){
            InputObject inputObject =  mapper.convertValue(object, InputObject.class);
            inputObject.setCountry("US");
            ZipwiseSalesTax taxRecord = new ZipwiseSalesTax();
            taxRecord.setCountry(inputObject.getCountry());
            taxRecord.setState(inputObject.getState());
            taxRecord.setActive(true);
            taxRecord.setCity(inputObject.getCity());
            taxRecord.setTaxRegionName(inputObject.getTaxRegionName());

            List<TaxTable> taxTables = new ArrayList<TaxTable>();

            for(TaxTable.ConsumerType type : TaxTable.ConsumerType.values()){
                TaxTable taxTable = new TaxTable();
                taxTable.setConsumerType(type);
                taxTable.setTaxOrder(TaxTable.TaxOrder.PostOrder);
                taxTable.setName(type.getMessage());

                taxTable.setActive(true);

                {
                    TaxDetails cityTax = new TaxDetails();

                    cityTax.setActiveExciseTax(false);
                    cityTax.setCompound(false);
                    cityTax.setTerritory("City");
                    cityTax.setTaxOrder("Post");
                    try {
                        cityTax.setTaxRate(Double.parseDouble(inputObject.getCityRate()));
                    } catch (NumberFormatException e) {
                        cityTax.setTaxRate(0);
                    }

                    if(inputObject.getState().equalsIgnoreCase("CA") && type != TaxTable.ConsumerType.AdultUse) {
                        cityTax.setActive(false);
                    }
                    else {
                        if (cityTax.getTaxRate() == 0)
                            cityTax.setActive(false);
                        else
                            cityTax.setActive(true);
                    }



                    taxTable.setCityTax(cityTax);
                }
                {
                    TaxDetails stateTax = new TaxDetails();

                    stateTax.setActiveExciseTax(false);
                    stateTax.setCompound(false);
                    stateTax.setTerritory("State");
                    stateTax.setTaxOrder("Post");
                    try {
                        stateTax.setTaxRate(Double.parseDouble(inputObject.getStateRate()));
                    } catch (NumberFormatException e) {
                        stateTax.setTaxRate(0);
                    }
                    if (stateTax.getTaxRate() == 0)
                        stateTax.setActive(false);
                    else
                        stateTax.setActive(true);

                    taxTable.setStateTax(stateTax);
                }
                {
                    TaxDetails county = new TaxDetails();

                    county.setActiveExciseTax(false);
                    county.setCompound(false);
                    county.setTerritory("County");
                    county.setTaxOrder("Post");
                    county.setCountyName(inputObject.getCounty());
                    try {
                        county.setTaxRate(Double.parseDouble(inputObject.getCountyRate()));
                    } catch (NumberFormatException e) {
                        county.setTaxRate(0);
                    }
                    if (county.getTaxRate() == 0)
                        county.setActive(false);
                    else
                        county.setActive(true);

                    taxTable.setCountyTax(county);
                }
                {
                    TaxDetails special = new TaxDetails();

                    special.setActiveExciseTax(false);
                    special.setCompound(false);
                    special.setTerritory("Special");
                    special.setTaxOrder("Post");
                    special.setCountyName(inputObject.getCounty());
                    try {
                        special.setTaxRate(Double.parseDouble(inputObject.getSpecialRate()));
                    } catch (NumberFormatException e) {
                        special.setTaxRate(0);
                    }
                    if (special.getTaxRate() == 0)
                        special.setActive(false);
                    else
                        special.setActive(true);

                    taxTable.setSpecialTax(special);
                }

                taxTables.add(taxTable);
                taxRecord.setTaxTables(taxTables);
            }


            try{
                taxRecord.setZipcode(Integer.parseInt(inputObject.getZipCode()));
                zipwiseSalesTaxes.add(taxRecord);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }

        // Write JSON formatted data to output.json file
        mapper.writerWithDefaultPrettyPrinter().writeValue(output, zipwiseSalesTaxes);
    }
}