package com.grow.controller;

import com.grow.commands.Commands;

public class Controller {

    private final Commands commands;

    public Controller(Commands commands) {
        this.commands = commands;
    }

    public void execute(String command) {
        String[] commandAndParams = command.split("\\s+");
        commands.execute(commandAndParams);
    }

}
