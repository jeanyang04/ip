package commands;

import common.Ui;
import common.Command;

public class ExitCommand extends Command {
    @Override
    public boolean execute(Ui ui) {
        ui.showGoodbye();
        return false;
    }
}
