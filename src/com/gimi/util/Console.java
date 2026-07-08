package com.gimi.util;
public class Console
{
    private Console()
    {  
    }
    public static void printHeader(String appName, String version)
    {
        System.out.println("=========================");
        System.out.println("        " + appName + "  " + version + "       ");
        System.out.println("=========================");
    }
    public static void printSection(String title)
    {
        System.out.println();
        System.out.println(title);
        for(int i=0; i < title.length(); i++)
        {
            System.out.print("-");
        }
        System.out.println();
        System.out.println();
    }
    public static void printMessage(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }
    public static void showError(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }
}