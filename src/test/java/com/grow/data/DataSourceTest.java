package com.grow.data;

import com.grow.model.Vehicle;
import com.grow.model.VehicleType;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class DataSourceTest {

    @Test
    public void testRead() throws IOException {
        DataSource dataSource = new DataSource("test.json");
        Vehicle motorcycle = new Vehicle("Honda", "VT750C2B-SHADOW PHANTOM", 2017, 13838,
            VehicleType.MOTORCYCLE, true, true);

        List<Vehicle> vehicles = dataSource.read();

        Assert.assertEquals(vehicles.size(), 1);
        Assert.assertTrue(vehicles.contains(motorcycle));
    }


    @Test(expectedExceptions = IOException.class)
    public void testWrongFilenameRead() throws IOException {
        DataSource dataSource = new DataSource("fileNotFound");

        dataSource.read();
    }
}
