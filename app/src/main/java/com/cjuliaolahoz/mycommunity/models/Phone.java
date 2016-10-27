package com.cjuliaolahoz.mycommunity.models;

/**
 * Created by cjuliaol on 24/10/2016.
 */

public class Phone {
    private int phoneId;
    private int inhabitantId;
    private String name;
    private int phoneType;

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getInhabitantId() {
        return inhabitantId;
    }

    public void setInhabitantId(int inhabitantId) {
        this.inhabitantId = inhabitantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(int phoneType) {
        this.phoneType = phoneType;
    }
}
