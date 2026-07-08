package com.gimi.assistant;
import com.gimi.util.Console;
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
        Console.printHeader(APP_NAME, VERSION);
        Console.printMessage("Hello!");
        System.out.println("I am " + APP_NAME + ".");
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
            String input = scanner.nextLine().trim();
            if (input.isEmpty())
            {
                continue;
            }
            String[] parts = input.split(" ", 2);
            String command = parts[0].toLowerCase();
            String arguments = parts.length>1 ? parts[1] : "";
            switch (command)
            {
                case "help":
                    showHelp();
                    break;
                case "about":
                    showAbout();
                    break;
                case "echo":
                    echo(arguments);
                    break;
                case "exit":
                    Console.printMessage("Goodbye!");
                    return;
                default:
                    Console.showError("Unknown command: " + command);
                    Console.printMessage("Type \"help\" to see available commands.");
            }
        }
    }
    private void showHelp()
    {
        Console.printSection("Available Commands");
        System.out.println("help    - Show available commands");
        System.out.println("about   - Information about GiMi");
        System.out.println("echo    - Display the given text");
        System.out.println("exit    - Exit GiMi");
        System.out.println();
    }
    private void showAbout()
    {
        Console.printSection("About GiMi");
        System.out.println("Name    :   " + APP_NAME );
        System.out.println("Version :   " + VERSION );
        System.out.println("Author  :   " + AUTHOR );
        System.out.println();
    }
    private void echo(String arguments)
    {
        if (!arguments.isEmpty())
        {
            Console.printMessage(arguments);
        }
        else
        {
            Console.printMessage("Usage: echo <text>");
        }
    }
}