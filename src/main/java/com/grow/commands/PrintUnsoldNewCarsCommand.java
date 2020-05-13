package com.grow.commands;

import com.grow.service.ViewService;

public class PrintUnsoldNewCarsCommand  extends AbstractCommand{

    public PrintUnsoldNewCarsCommand(ViewService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        print(service.getUnsoldNewCars());
    }
}
