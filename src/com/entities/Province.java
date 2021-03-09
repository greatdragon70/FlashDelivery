package com.entities;

public class Province {
    private float code;
    private String name;

    public Province(float code, String name) {
        this.code = code;
        this.name = name;
    }

    public float getCode() {
        return code;
    }

    public void setCode(float code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
