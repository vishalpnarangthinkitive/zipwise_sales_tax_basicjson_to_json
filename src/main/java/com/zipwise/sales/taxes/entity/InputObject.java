package com.zipwise.sales.taxes.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InputObject {
    public String country;
    public String State;
    public String ZipCode;
    public String County;
    public String NormalizedCounty;
    public String City;
    public String NormalizedCity;
    public String TaxRegionName;
    public String NormalizedTaxRegionName;
    public String CombinedRate;
    public String StateRate;
    public String CountyRate;
    public String CityRate;
    public String SpecialRate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getNormalizedCounty() {
        return NormalizedCounty;
    }

    public void setNormalizedCounty(String normalizedCounty) {
        NormalizedCounty = normalizedCounty;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getNormalizedCity() {
        return NormalizedCity;
    }

    public void setNormalizedCity(String normalizedCity) {
        NormalizedCity = normalizedCity;
    }

    public String getTaxRegionName() {
        return TaxRegionName;
    }

    public void setTaxRegionName(String taxRegionName) {
        TaxRegionName = taxRegionName;
    }

    public String getNormalizedTaxRegionName() {
        return NormalizedTaxRegionName;
    }

    public void setNormalizedTaxRegionName(String normalizedTaxRegionName) {
        NormalizedTaxRegionName = normalizedTaxRegionName;
    }

    public String getCombinedRate() {
        return CombinedRate;
    }

    public void setCombinedRate(String combinedRate) {
        CombinedRate = combinedRate;
    }

    public String getStateRate() {
        return StateRate;
    }

    public void setStateRate(String stateRate) {
        StateRate = stateRate;
    }

    public String getCountyRate() {
        return CountyRate;
    }

    public void setCountyRate(String countyRate) {
        CountyRate = countyRate;
    }

    public String getCityRate() {
        return CityRate;
    }

    public void setCityRate(String cityRate) {
        CityRate = cityRate;
    }

    public String getSpecialRate() {
        return SpecialRate;
    }

    public void setSpecialRate(String specialRate) {
        SpecialRate = specialRate;
    }

    @Override
    public String toString() {
        return "InputObject{" +
                "country='" + country + '\'' +
                ", State='" + State + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                ", County='" + County + '\'' +
                ", NormalizedCounty='" + NormalizedCounty + '\'' +
                ", City='" + City + '\'' +
                ", NormalizedCity='" + NormalizedCity + '\'' +
                ", TaxRegionName='" + TaxRegionName + '\'' +
                ", NormalizedTaxRegionName='" + NormalizedTaxRegionName + '\'' +
                ", CombinedRate='" + CombinedRate + '\'' +
                ", StateRate='" + StateRate + '\'' +
                ", CountyRate='" + CountyRate + '\'' +
                ", CityRate='" + CityRate + '\'' +
                ", SpecialRate='" + SpecialRate + '\'' +
                '}';
    }
}
