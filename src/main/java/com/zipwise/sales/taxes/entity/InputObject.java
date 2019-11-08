package com.zipwise.sales.taxes.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InputObject {
    public String country;
    public String state;
    public String zipcode;
    public String tax_region_name;
    public String RiskLevel;
    public String state_rate;
    public String county_rate;
    public String city_rate;
    public String special_rate;
    public String combined_rate;

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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTax_region_name() {
        return tax_region_name;
    }

    public void setTax_region_name(String tax_region_name) {
        this.tax_region_name = tax_region_name;
    }

    public String getRiskLevel() {
        return RiskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        RiskLevel = riskLevel;
    }

    public String getState_rate() {
        return state_rate;
    }

    public void setState_rate(String state_rate) {
        this.state_rate = state_rate;
    }

    public String getCounty_rate() {
        return county_rate;
    }

    public void setCounty_rate(String county_rate) {
        this.county_rate = county_rate;
    }

    public String getCity_rate() {
        return city_rate;
    }

    public void setCity_rate(String city_rate) {
        this.city_rate = city_rate;
    }

    public String getSpecial_rate() {
        return special_rate;
    }

    public void setSpecial_rate(String special_rate) {
        this.special_rate = special_rate;
    }

    public String getCombined_rate() {
        return combined_rate;
    }

    public void setCombined_rate(String combined_rate) {
        this.combined_rate = combined_rate;
    }

    @Override
    public String toString() {
        return "InputObject{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", tax_region_name='" + tax_region_name + '\'' +
                ", RiskLevel='" + RiskLevel + '\'' +
                ", state_rate='" + state_rate + '\'' +
                ", county_rate='" + county_rate + '\'' +
                ", city_rate='" + city_rate + '\'' +
                ", special_rate='" + special_rate + '\'' +
                ", combined_rate='" + combined_rate + '\'' +
                '}';
    }
}
