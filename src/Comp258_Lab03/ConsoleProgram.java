/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_Lab03;

import java.util.Scanner;

public abstract class ConsoleProgram {

    protected static final int QUIT_OPTION = 0;

    private Scanner keyboard;

    public ConsoleProgram() {
        keyboard = new Scanner(System.in);
    }

    public void run() {

        startProgram();

        int choice;

        do {
            choice = showMenu();

            if (choice != QUIT_OPTION) {
                executeAction(choice);
            }

        } while (choice != QUIT_OPTION);

        endProgram();
    }

    public abstract int showMenu();

    public abstract void executeAction(int choice);

    public int readInt(String prompt) {

        System.out.print(prompt);

        return keyboard.nextInt();
    }

    public void startProgram() {

        System.out.println("Starting program...");
    }

    public void endProgram() {

        System.out.println("Program ended.");
    }
}