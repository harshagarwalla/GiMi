package com.gimi.assistant;
import java.util.Scanner;
public class Assistant
{
    private final Scanner scanner = new Scanner(System.in);
    private static final String APP_NAME = "GiMi";
    private static final String VERSION = "v0.1";
    private static final String AUTHOR = "Harsh";
    public void start()
    {
        displayWelcomeScreen();
        commandLoop();
    }
    private void displayWelcomeScreen()
    {
        System.out.println("=========================");
        System.out.println("        " + APP_NAME + "  " + VERSION + "       ");
        System.out.println("=========================");
        System.out.println();
        System.out.println("Hello!");
        System.out.println();
        System.out.println("I am " + APP_NAME +".");
        System.out.println("Your Personal Assistant.");
        System.out.println();
        System.out.println("Type \"help\" to see available commands.");
        System.out.println();
    }
    private void commandLoop()
    {
        while (true)
        {
            System.out.print("> ");
            String command = scanner.nextLine().trim().toLowerCase();
            switch (command)
            {
                case "help":
                    showHelp();
                    break;
                case "about":
                    showAbout();
                    break;
                case "exit":
                    System.out.println("\nGoodbye!");
                    return;
                default:
                    System.out.println("\nUnknown command: " + command);
                    System.out.println("\nType \"help\" to see available commands.\n");
            }
        }
    }
    private void showHelp()
    {
        System.out.println();
        System.out.println("Available Commands");
        System.out.println("------------------");
        System.out.println();
        System.out.println("help    - Show available commands");
        System.out.println("about   - Information about GiMi");
        System.out.println("exit    - Exit GiMi");
        System.out.println();
    }
    private void showAbout()
    {
        System.out.println();
        System.out.println("About GiMi");
        System.out.println("----------");
        System.out.println();
        System.out.println("Name    :   " + APP_NAME );
        System.out.println("Version :   " + VERSION );
        System.out.println("Author  :   " + AUTHOR );
        System.out.println();
    }
}