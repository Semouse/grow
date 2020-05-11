package com.grow.model;

public class Vehicle {

    private  int price;
    private  int year;
    private  VehicleType type;
    private  String make;
    private  String model;
    private  boolean isSold;
    private  boolean isUsed;

    public Vehicle() {
    }

    public Vehicle(int price, int year, VehicleType type, String make, String model, boolean isSold, boolean isUsed) {
        this.price = price;
        this.year = year;
        this.type = type;
        this.make = make;
        this.model = model;
        this.isSold = isSold;
        this.isUsed = isUsed;
    }

}
