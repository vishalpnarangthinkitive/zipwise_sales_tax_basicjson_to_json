package com.zipwise.sales.taxes.entity;

import java.util.List;

public class TaxTable {
    public enum ConsumerType{
        AdultUse("Adult use"),
        MedicinalState("Medicinal - MMIC"),
        MedicinalThirdParty("Medicinal - Third Party");

        private String message;

        ConsumerType(String message){
            this.message = message;
        }

        public String getMessage(){
            return message;
        }
    }

    public enum TaxOrder{
        PostOrder,
        PreOrder
    }

    private ConsumerType consumerType;
    private boolean active;
    private String name;
    private TaxOrder taxOrder;
    private TaxDetails cityTax;
    private TaxDetails stateTax;
    private TaxDetails countyTax;
    private TaxDetails specialTax;

    public ConsumerType getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(ConsumerType consumerType) {
        this.consumerType = consumerType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaxOrder getTaxOrder() {
        return taxOrder;
    }

    public void setTaxOrder(TaxOrder taxOrder) {
        this.taxOrder = taxOrder;
    }

    public TaxDetails getCityTax() {
        return cityTax;
    }

    public void setCityTax(TaxDetails cityTax) {
        this.cityTax = cityTax;
    }

    public TaxDetails getStateTax() {
        return stateTax;
    }

    public void setStateTax(TaxDetails stateTax) {
        this.stateTax = stateTax;
    }

    public TaxDetails getCountyTax() {
        return countyTax;
    }

    public void setCountyTax(TaxDetails countyTax) {
        this.countyTax = countyTax;
    }

    public TaxDetails getSpecialTax() {
        return specialTax;
    }

    public void setSpecialTax(TaxDetails specialTax) {
        this.specialTax = specialTax;
    }
}
