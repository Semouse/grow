package com.grow.commands;

import com.grow.service.ViewService;

public class PrintMotorcyclesCommand extends AbstractCommand {

    PrintMotorcyclesCommand(ViewService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        print(service.getMotorcycles());
    }
}
