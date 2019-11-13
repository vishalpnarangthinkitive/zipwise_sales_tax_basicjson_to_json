package com.zipwise.sales.taxes.entity;

public class TaxDetails {
    private double taxRate;
    private boolean compound;
    private boolean active;
    private String territory;
    private boolean activeExciseTax;
    private String taxOrder;
    private String countyName;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public boolean isCompound() {
        return compound;
    }

    public void setCompound(boolean compound) {
        this.compound = compound;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public boolean isActiveExciseTax() {
        return activeExciseTax;
    }

    public void setActiveExciseTax(boolean activeExciseTax) {
        this.activeExciseTax = activeExciseTax;
    }

    public String getTaxOrder() {
        return taxOrder;
    }

    public void setTaxOrder(String taxOrder) {
        this.taxOrder = taxOrder;
    }
}
