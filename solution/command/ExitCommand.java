package com.codegym.task.task31.task3110.command;

import src.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Bye!");
    }
}
