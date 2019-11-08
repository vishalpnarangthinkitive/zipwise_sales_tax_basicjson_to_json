package com.zipwise.sales.taxes.entity;

import java.util.List;

public class ZipwiseSalesTaxes {

    private String county;
    private String state;                           
    private int zipcode;
    private int risklevel;
    private boolean active;
    private List<TaxTable> taxTables;

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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
