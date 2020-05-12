package com.grow.service;

import com.grow.model.Vehicle;

import java.util.List;

public interface Service {

    List<Vehicle> getCars();

    List<Vehicle> getUnsoldCars();

    Vehicle getMostExpensiveCar();

    List<Vehicle> getMotorcycles();

    List<Vehicle> getUnsoldNewCars();

    boolean isAllCarsSoldExceptYear();

}
