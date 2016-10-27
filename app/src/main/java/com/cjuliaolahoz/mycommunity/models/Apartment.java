package com.cjuliaolahoz.mycommunity.models;

/**
 * Created by cjuliaol on 24/10/2016.
 */

public class Apartment {
    private int apartmentId;
    private String name;
    private String building;
    private int owner;
    private int inhabitant;

    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getInhabitant() {
        return inhabitant;
    }

    public void setInhabitant(int inhabitant) {
        this.inhabitant = inhabitant;
    }
}
