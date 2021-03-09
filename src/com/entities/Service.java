package com.entities;

public class Service {
    private int postCode;
    private String name;
    private float price;

    public Service(int postCode, String name, float price) {
        this.postCode = postCode;
        this.name = name;
        this.price = price;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
