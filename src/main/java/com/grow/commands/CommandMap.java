package com.grow.commands;

import com.grow.service.ViewService;

import java.util.HashMap;
import java.util.Map;

public class CommandMap {

    private Map<String, AbstractCommand> commands;

    public CommandMap() {
    }

    public void init(ViewService service) {
        commands = new HashMap<>();
        commands.put("print_cars", new PrintCarsCommand(service));
        commands.put("print_unsold_cars", new PrintUnsoldCarCommand(service));
        commands.put("print_most_expensive_car", new PrintMostExpensiveCarCommand(service));
        commands.put("print_motorcycles", new PrintMotorcyclesCommand(service));
        commands.put("print_unsold_new_cars", new PrintUnsoldCarCommand(service));
    }

    public void execute(String s) {
        commands.get(s).execute();
    }
}
