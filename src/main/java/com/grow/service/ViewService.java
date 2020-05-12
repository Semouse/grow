package com.grow.service;

import com.grow.model.Vehicle;

import java.util.List;

public class ViewService implements Service {

    private final List<Vehicle> vehicles;

    public ViewService(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public List<Vehicle> getCars() {
        return null;
    }

    @Override
    public List<Vehicle> getUnsoldCars() {
        return null;
    }

    @Override
    public Vehicle getMostExpensiveCar() {
        return null;
    }

    @Override
    public List<Vehicle> getMotorcycles() {
        return null;
    }

    @Override
    public List<Vehicle> getUnsoldNewCars() {
        return null;
    }

    @Override
    public boolean isAllCarsSoldExceptYear() {
        return false;
    }
}
