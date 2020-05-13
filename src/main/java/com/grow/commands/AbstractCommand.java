package com.grow.commands;

import com.grow.model.Vehicle;
import com.grow.service.ViewService;

import java.util.List;

public abstract class AbstractCommand implements ICommand {

    ViewService service;

    void print(List<Vehicle> vehicles) {
        vehicles.forEach(Vehicle::print);
    }
}
