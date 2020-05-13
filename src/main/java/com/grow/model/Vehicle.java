package com.grow.model;

public class Vehicle {

    private String make;
    private String model;
    private int year;
    private int price;
    private VehicleType type;
    private boolean sold;
    private boolean used;

    private Vehicle() {
    }

    public Vehicle(String make, String model, int year, int price, VehicleType type, boolean sold, boolean used) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.type = type;
        this.sold = sold;
        this.used = used;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public VehicleType getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isSold() {
        return sold;
    }

    public boolean isUsed() {
        return used;
    }

    public void print() {
        System.out.println(String.format("%s %s %s %s %s", make, model, year, price, type));
    }

}
