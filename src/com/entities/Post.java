package com.entities;

public class Post {
    private float postCode;
    private String postName;
    private float provinceCode;
    private float districtCode;
    private String village;
    private String hamlet;

    public Post(float postCode, String postName, float provinceCode, float districtCode, String village, String hamlet) {
        this.postCode = postCode;
        this.postName = postName;
        this.provinceCode = provinceCode;
        this.districtCode = districtCode;
        this.village = village;
        this.hamlet = hamlet;
    }

    public float getPostCode() {
        return postCode;
    }

    public void setPostCode(float postCode) {
        this.postCode = postCode;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public float getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(float provinceCode) {
        this.provinceCode = provinceCode;
    }

    public float getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(float districtCode) {
        this.districtCode = districtCode;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getHamlet() {
        return hamlet;
    }

    public void setHamlet(String hamlet) {
        this.hamlet = hamlet;
    }
}
