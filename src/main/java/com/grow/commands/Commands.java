package com.grow.commands;

import com.grow.model.Vehicle;
import com.grow.service.ViewService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commands {

    private ViewService service;
    private Map<String, ICommand> commands;

    public Commands() {
    }

    public void init(ViewService service) {
        this.service = service;
        commands = new HashMap<>();
        commands.put("print_cars", new PrintCarsCommand());
        commands.put("print_unsold_cars", new PrintUnsoldCarsCommand());
        commands.put("print_most_expensive_car", new PrintMostExpensiveCarCommand());
        commands.put("print_motorcycles", new PrintMotorcyclesCommand());
        commands.put("print_unsold_new_cars", new PrintUnsoldNewCarsCommand());
    }

    public void execute(String command) {
        ICommand iCommand = commands.get(command);
        if (iCommand != null) {
            iCommand.execute();
        }
    }

    private void print(List<Vehicle> vehicles) {
        vehicles.forEach(Vehicle::print);
    }

    private class PrintCarsCommand implements ICommand {

        @Override
        public void execute() {
            print(service.getCars());
        }
    }

    private class PrintMostExpensiveCarCommand implements ICommand {

        @Override
        public void execute() {
            service.getMostExpensiveCar().print();
        }
    }

    private class PrintMotorcyclesCommand implements ICommand {

        @Override
        public void execute() {
            print(service.getMotorcycles());
        }
    }

    private class PrintUnsoldCarsCommand implements ICommand {

        @Override
        public void execute() {
            print(service.getUnsoldCars());
        }
    }

    private class PrintUnsoldNewCarsCommand implements ICommand {

        @Override
        public void execute() {
            print(service.getUnsoldNewCars());
        }
    }

}
