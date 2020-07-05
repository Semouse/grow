package com.grow.commands;

import com.grow.model.Vehicle;
import com.grow.service.ViewService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Commands {

    private Map<String, ICommand> commands;

    public Commands() {
    }

    public void init(ViewService service) {
        commands = new HashMap<>();
        commands.put("print_cars", command -> print(service.getCars()));
        commands.put("print_is_all_cars_sold_except_year", parameters -> {
            int year = Integer.valueOf(parameters[1]);
            System.out.println(service.isAllCarsSoldExceptYear(year));
        });
        commands.put("print_most_expensive_car", command -> service.getMostExpensiveCar().print());
        commands.put("print_motorcycles", command -> print(service.getMotorcycles()));
        commands.put("print_unsold_cars", command -> print(service.getUnsoldCars()));
        commands.put("print_unsold_new_cars", command -> print(service.getUnsoldNewCars()));
    }

    public void execute(String[] command) {

        ICommand iCommand = commands.get(command[0]);
        if (iCommand != null) {
            iCommand.execute(command);
        }
    }

    private void print(List<Vehicle> vehicles) {
        vehicles.forEach(Vehicle::print);
    }
}
