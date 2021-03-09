package com.entities;

public class Cost {
    private String weightCode;
    private String domainCode;
    private float price;

    public Cost(String weightCode, String domainCode, float price) {
        this.weightCode = weightCode;
        this.domainCode = domainCode;
        this.price = price;
    }

    public Cost(String domainCode, float price) {
        this.domainCode = domainCode;
        this.price = price;
    }

    public String getWeightCode() {
        return weightCode;
    }

    public void setWeightCode(String weightCode) {
        this.weightCode = weightCode;
    }

    public String getDomainCode() {
        return domainCode;
    }

    public void setDomainCode(String domainCode) {
        this.domainCode = domainCode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
