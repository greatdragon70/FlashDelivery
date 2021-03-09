package com.entities;

public class District {
    private float provinceCode;
    private float districtCode;
    private String districtName;

    public District(float provinceCode, float districtCode, String districtName) {
        this.provinceCode = provinceCode;
        this.districtCode = districtCode;
        this.districtName = districtName;
    }
}
