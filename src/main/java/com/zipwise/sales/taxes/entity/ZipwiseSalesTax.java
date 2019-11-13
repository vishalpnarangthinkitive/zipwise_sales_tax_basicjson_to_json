package com.zipwise.sales.taxes.entity;

import java.util.List;

public class ZipwiseSalesTax {

    private String country;
    private String state;                           
    private int zipcode;
    private String county;
    private String city;
    private String taxRegionName;
    private boolean active;
    private List<TaxTable> taxTables;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTaxRegionName() {
        return taxRegionName;
    }

    public void setTaxRegionName(String taxRegionName) {
        this.taxRegionName = taxRegionName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<TaxTable> getTaxTables() {
        return taxTables;
    }

    public void setTaxTables(List<TaxTable> taxTables) {
        this.taxTables = taxTables;
    }
}
