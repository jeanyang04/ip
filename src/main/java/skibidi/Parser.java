package skibidi;

import commands.*;

/**
 * Represents a parser to parse user input.
 */
public class Parser {
    /**
     * Parses the user input and returns the corresponding command.
     *
     * @param input The user input.
     * @return The corresponding command.
     * @throws SkibidiException If the user input is invalid.
     */
    public Command parse(String input) throws SkibidiException {

        String normalizedInput = input.trim().toLowerCase();

        if (normalizedInput.equals("bye")) {
            return new ExitCommand();
        } else if (normalizedInput.equals("list")) {
            return new ListCommand();
        } else if (normalizedInput.startsWith("todo ")) {
            return new AddTodoCommand(input);
        } else if (normalizedInput.startsWith("deadline ")) {
            return new AddDeadlineCommand(input);
        } else if (normalizedInput.startsWith("event ")) {
            return new AddEventCommand(input);
        } else if (normalizedInput.startsWith("mark ")) {
            return new MarkCommand(input);
        } else if (normalizedInput.startsWith("unmark ")) {
            return new UnmarkCommand(input);
        } else if (normalizedInput.startsWith("delete ")) {
            return new DeleteCommand(input);
        } else {
            throw new SkibidiException("OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
    }
}