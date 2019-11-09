package com.zipwise.sales.taxes.entity;

import java.util.List;

public class ZipwiseSalesTax {

    private String country;
    private String state;                           
    private int zipcode;
    private int risklevel;
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

    public int getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(int risklevel) {
        this.risklevel = risklevel;
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
