package com.grow.model;

public class Vehicle {

    private int price;
    private int year;
    private VehicleType type;
    private String make;
    private String model;
    private boolean sold;
    private boolean used;

    public Vehicle() {
    }

    public Vehicle(int price, int year, VehicleType type, String make, String model, boolean sold, boolean used) {
        this.price = price;
        this.year = year;
        this.type = type;
        this.make = make;
        this.model = model;
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
