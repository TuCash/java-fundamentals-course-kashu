/**
 * Lesson 6 - Next steps and small utilities
 * File: starter-files/lesson6-next-steps/Main.java
 *
 * Shows simple command handling and argument parsing.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 6 — Next steps: small utilities and argument handling\n");

        if (args.length == 0) {
            System.out.println("No arguments provided. Run: java Main greet\n");
            return;
        }

        String command = args[0];
        switch (command) {
            case "greet":
                System.out.println("Hello! This is an example of how to pass arguments to the program.");
                break;
            case "sum":
                if (args.length >= 3) {
                    try {
                        int x = Integer.parseInt(args[1]);
                        int y = Integer.parseInt(args[2]);
                        System.out.printf("%d + %d = %d\n", x, y, x + y);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid arguments for sum. Use: sum 2 3");
                    }
                } else {
                    System.out.println("Missing arguments for sum. Use: sum <a> <b>");
                }
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }
}
