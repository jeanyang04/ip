package common;

import commands.EchoCommand;
import commands.ExitCommand;
import common.Command;

public class Parser {
    public Command parse(String input) {

        String normalizedInput = input.trim().toLowerCase();

        if (normalizedInput.equals("bye")) {
            return new ExitCommand();
        } else {
            return new EchoCommand(input);
        }
    }
}