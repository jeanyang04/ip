package common;

public class Ui {
    private String logo = "   _____ _  _______ ____ _____ _____ _____ \n"
            + "  / ____| |/ /_   _|  _ \\_   _|  __ \\_   _|\n"
            + " | (___ | ' /  | | | |_) || | | |  | || |  \n"
            + "  \\___ \\|  <   | | |  _ < | | | |  | || |  \n"
            + "  ____) | . \\ _| |_| |_) || |_| |__| || |_ \n"
            + " |_____/|_|\\_\\_____|____/_____|_____/_____|\n";
    public void showWelcome() {
        System.out.println("____________________________________________________________\n"
                + " Hello! I'm SKIBIDI\n"
                + " What can I do for you?\n"
                + "____________________________________________________________\n");
    }

    public void printMessage(String message) {
        System.out.println(" ");
        System.out.println("Erm...");
        System.out.println("SKIBIDI: " + message);
        System.out.println(" ");
    }

    public void showGoodbye() {
        System.out.println("____________________________________________________________");
        System.out.println(" Bye. Hope to see you again soon!");
        System.out.println("____________________________________________________________");
    }
}