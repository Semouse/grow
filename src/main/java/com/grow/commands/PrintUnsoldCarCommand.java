package com.grow.commands;

import com.grow.service.ViewService;

public class PrintUnsoldCarCommand extends AbstractCommand{

    PrintUnsoldCarCommand(ViewService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        print(service.getUnsoldCars());
    }
}
