package com.grow.service;

import com.grow.model.Vehicle;
import com.grow.model.VehicleType;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ViewService implements Service {

    private final List<Vehicle> vehicles;

    public ViewService(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public List<Vehicle> getCars() {
        return vehicles.stream()
            .filter(vehicle -> VehicleType.MOTORCYCLE != vehicle.getType())
            .collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getUnsoldCars() {
        return vehicles.stream()
            .filter(vehicle -> VehicleType.MOTORCYCLE != vehicle.getType())
            .filter(Vehicle::isSold)
            .sorted(Comparator.comparingInt(Vehicle::getPrice))
            .collect(Collectors.toList());
    }

    @Override
    public Vehicle getMostExpensiveCar() {
        return Collections.max(vehicles, Comparator.comparingInt(Vehicle::getPrice));
    }

    @Override
    public List<Vehicle> getMotorcycles() {
        return vehicles.stream()
            .filter(vehicle -> VehicleType.MOTORCYCLE == vehicle.getType())
            .sorted(Comparator.comparingInt(Vehicle::getPrice))
            .collect(Collectors.toList());
    }

    @Override
    public List<Vehicle> getUnsoldNewCars() {
        return vehicles.stream()
            .filter(vehicle -> VehicleType.MOTORCYCLE != vehicle.getType())
            .filter(vehicle -> !vehicle.isSold())
            .filter(vehicle -> !vehicle.isUsed())
            .collect(Collectors.toList());
    }

    @Override
    public boolean isAllCarsSoldExceptYear(int exceptYear) {
        return vehicles.stream()
            .filter(vehicle -> VehicleType.MOTORCYCLE != vehicle.getType())
            .filter(vehicle -> vehicle.getYear() != exceptYear)
            .allMatch(Vehicle::isSold);
    }
}
