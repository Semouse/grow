package com.grow.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VehicleType {

    MOTORCYCLE("Motorcycle"),
    PASSENGER_CAR("Passenger Car"),
    MPV("Multipurpose Passenger Vehicle (MPV)");

    @JsonValue
    private String type;

    VehicleType(String type) {
        this.type = type;
    }

}
