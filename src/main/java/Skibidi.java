import common.Command;
import common.Parser;
import common.Ui;

import java.util.Scanner;

public class Skibidi {
    private final Ui ui;
    private final Parser parser;

    public Skibidi() {
        ui = new Ui();
        parser = new Parser();
    }
    public void run() {
        ui.showWelcome();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            String userInput = scanner.nextLine();
            Command command = parser.parse(userInput);
            isRunning = command.execute(ui);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new Skibidi().run();
    }
}
