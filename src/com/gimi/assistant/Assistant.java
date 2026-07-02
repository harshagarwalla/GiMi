package com.gimi.assistant;
import java.util.Scanner;
public class Assistant
{
    private final Scanner scanner=new Scanner(System.in);
    public void start()
    {
        displayWelcomeScreen();
        commandLoop();
    }
    private void displayWelcomeScreen()
    {
        System.out.println("=========================");
        System.out.println("         GiMi v0.1       ");
        System.out.println("=========================");
        System.out.println();
        System.out.println("Hello!");
        System.out.println();
        System.out.println("I am GiMi.");
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
            String command=scanner.nextLine().trim().toLowerCase();
            switch (command)
            {
                case "exit":
                    System.out.println("\nGoodbye!");
                    return;
                default:
                    System.out.println("\nUnknown command: "+command);
                    System.out.println("\nType \"help\" to see available commands.\n");
            }
        }
    }
}