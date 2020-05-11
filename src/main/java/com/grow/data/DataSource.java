package com.grow.data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grow.model.Vehicle;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DataSource {

    private static final TypeReference<List<Vehicle>> TYPE_REFERENCE = new TypeReference<List<Vehicle>>() {};
    private final String fileName;
    private final ObjectMapper mapper = new ObjectMapper();

    public DataSource(String fileName) {
        this.fileName = fileName;
    }

    public List<Vehicle> read() throws IOException {
        InputStream resource = ClassLoader.getSystemClassLoader().getResourceAsStream(fileName);
        if (resource == null) {
            throw new IOException();
        }
        return mapper.readValue(resource, TYPE_REFERENCE);
    }

}
