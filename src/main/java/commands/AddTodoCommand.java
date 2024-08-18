package commands;

import common.Command;
import common.Ui;
import storage.TaskStorage;
import storage.Todo;

public class AddTodoCommand extends Command {
    private String description;

    public AddTodoCommand(String description) {
        this.description = description;
    }

    @Override
    public boolean execute(Ui ui, TaskStorage storage) {
        Todo todo = new Todo(description);
        storage.addTask(todo);
        ui.printMessage("Got it. I've added this task:\n  " + todo);
        return true;
    }
}
