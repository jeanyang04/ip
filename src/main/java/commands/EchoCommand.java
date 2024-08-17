package commands;

import common.Ui;
import common.Command;

public class EchoCommand extends Command {
    private String message;

    public EchoCommand(String message) {
        this.message = message;
    }

    @Override
    public boolean execute(Ui ui) {
        ui.printMessage(message);
        return true; // Continue running
    }
}