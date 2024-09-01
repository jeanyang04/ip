package commands;

import common.Command;
import common.SkibidiException;
import common.Ui;
import storage.TaskStorage;
import storage.Deadline;

import java.io.IOException;
import java.time.format.DateTimeParseException;

public class AddDeadlineCommand extends Command {
    private String description;
    private String deadline;

    public AddDeadlineCommand(String input) throws SkibidiException{
        String[] parts = input.split("/by ");
        if (parts.length < 2) {
            throw new SkibidiException("Invalid deadline format. Usage: deadline [description] /by [date]");
        } else {
            this.description = parts[0].substring(9).trim();
            this.deadline = parts[1].trim();
        }
    }

    @Override
    public boolean execute(Ui ui, TaskStorage storage) {
        try {
            Deadline deadline = new Deadline(description, this.deadline, false);
            storage.addTask(deadline);
            ui.printMessage("Got it. I've added this task:\n  " + deadline);
        } catch (SkibidiException | IOException e) {
            ui.printMessage(e.getMessage());
        } catch (DateTimeParseException e) {
            ui.printMessage("Invalid date format. Please use yyyy-mm-dd.");
        }
        return true;
    }
}
