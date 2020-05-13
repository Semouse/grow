package com.grow.service;

import com.grow.model.Vehicle;
import com.grow.model.VehicleType;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ViewServiceTest {

    private Service service;

    @BeforeTest
    public void init() {
        Vehicle motorcycle = new Vehicle("Honda", "VT750C2B-SHADOW PHANTOM", 2017, 13838,
            VehicleType.MOTORCYCLE, true, true);
        Vehicle car = new Vehicle("Ford", "C-max", 2017, 85158, VehicleType.PASSENGER_CAR,
            true, false);
        Vehicle van = new Vehicle("Ford", "Escape", 2018, 35858, VehicleType.MPV,
            false, false);
        Vehicle whiteVan = new Vehicle("Ford", "Escape", 2018, 36000, VehicleType.MPV,
            false, false);

        service = new ViewService(Arrays.asList(car, motorcycle, van, whiteVan));
    }

    @Test
    public void testGetCars() {
        List<Vehicle> actual = service.getCars();

        Assert.assertEquals(actual.size(), 3);
        for (Vehicle vehicle : actual) {
            Assert.assertNotEquals(vehicle.getType(), VehicleType.MOTORCYCLE);
        }
    }

    @Test
    public void testGetUnsoldCars() {
        List<Vehicle> actual = service.getUnsoldCars();

        Assert.assertEquals(actual.size(), 2);
        for (Vehicle vehicle : actual) {
            Assert.assertFalse(vehicle.isSold());
            Assert.assertNotEquals(vehicle.getType(), VehicleType.MOTORCYCLE);
        }
    }

    @Test
    public void testGetMostExpensiveCar() {
        Vehicle actual = service.getMostExpensiveCar();

        Assert.assertNotEquals(actual.getType(), VehicleType.MOTORCYCLE);
        Assert.assertEquals(actual.getPrice(), 85158);
    }

    @Test
    public void testGetMotorcycles() {
        List<Vehicle> actual = service.getMotorcycles();

        Assert.assertEquals(actual.size(), 1);
        for (Vehicle vehicle : actual) {
            Assert.assertEquals(vehicle.getType(), VehicleType.MOTORCYCLE);
        }
    }

    @Test
    public void testGetUnsoldNewCars() {
        List<Vehicle> actual = service.getUnsoldNewCars();

        Assert.assertEquals(actual.size(), 2);
        for (Vehicle vehicle : actual) {
            Assert.assertNotEquals(vehicle.getType(), VehicleType.MOTORCYCLE);
            Assert.assertFalse(vehicle.isSold());
            Assert.assertFalse(vehicle.isUsed());
        }
    }

    @Test(dataProvider = "years")
    public void testIsAllCarsSoldExceptYear(int year, boolean expected) {
        boolean actual = service.isAllCarsSoldExceptYear(year);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] years() {
        return new Object[][]{
            {2017, false},
            {2018, true}
        };
    }
}
