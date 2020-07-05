package com.grow;

import com.grow.commands.Commands;
import com.grow.controller.Controller;
import com.grow.data.DataSource;
import com.grow.model.Vehicle;
import com.grow.service.ViewService;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(final String[] args) {
        System.out.println("initial point");

        List<Vehicle> vehicles = Collections.emptyList();
        DataSource data = new DataSource("cars.json");
        try {
            vehicles = data.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ViewService service = new ViewService(vehicles);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Commands commands = new Commands();
        commands.init(service);

        Controller controller = new Controller(commands);
        controller.execute(s);
    }

}
