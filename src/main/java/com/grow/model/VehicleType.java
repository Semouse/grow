package com.grow.model;

public enum VehicleType {

    MOTORCYCLE("Motorcycle"),
    PASSENGER_CAR("Passenger Car"),
    MPV("Multipurpose Passenger Vehicle (MPV)");

    private String type;

    VehicleType(String type) {
        this.type = type;
    }

}
