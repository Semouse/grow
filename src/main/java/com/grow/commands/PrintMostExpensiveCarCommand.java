package com.grow.commands;

import com.grow.service.ViewService;

public class PrintMostExpensiveCarCommand extends AbstractCommand {

    PrintMostExpensiveCarCommand(ViewService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.getMostExpensiveCar().print();
    }
}
