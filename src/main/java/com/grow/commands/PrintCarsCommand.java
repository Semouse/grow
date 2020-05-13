package com.grow.commands;

import com.grow.service.ViewService;

public class PrintCarsCommand extends AbstractCommand {

    PrintCarsCommand(ViewService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        print(service.getCars());
    }
}
