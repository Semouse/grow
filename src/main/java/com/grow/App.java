package com.grow;

import com.grow.data.DataSource;
import com.grow.model.Vehicle;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(final String[] args) throws IOException {
        System.out.println("initial point");

        DataSource data = new DataSource("cars.json");
        List<Vehicle> vehicles = data.read();

        for (Vehicle vehicle : vehicles) {
            vehicle.print();
        }
    }

}
