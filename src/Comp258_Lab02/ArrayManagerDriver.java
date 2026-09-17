/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_Lab02;

import java.util.Scanner;

public class ArrayManagerDriver {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Start the manager with 9 numbers
        int[] startingValues = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        ArrayManager manager = new ArrayManager(startingValues);

        int choice = 0;

        // Keep showing the menu until the user chooses 6
        while (choice != 6) {

            System.out.println();
            System.out.println("===== ArrayManager Menu =====");
            System.out.println("1. Display number of items");
            System.out.println("2. Display all items");
            System.out.println("3. Add an item");
            System.out.println("4. Add an item at a position");
            System.out.println("5. Remove an item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = keyboard.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.println("Number of items: " + manager.size());
                        break;

                    case 2:
                        manager.print();
                        break;

                    case 3:
                        System.out.print("Enter the item to add: ");
                        int value = keyboard.nextInt();

                        manager.add(value);

                        System.out.println("Item added successfully.");
                        manager.print();
                        break;

                    case 4:
                        System.out.print("Enter the item to add: ");
                        int valueToInsert = keyboard.nextInt();

                        System.out.print("Enter the position: ");
                        int insertPosition = keyboard.nextInt();

                        manager.addAt(valueToInsert, insertPosition);

                        System.out.println("Item added successfully.");
                        manager.print();
                        break;

                    case 5:
                        System.out.print("Enter the position to remove: ");
                        int positionToRemove = keyboard.nextInt();

                        manager.remove(positionToRemove);

                        System.out.println("Item removed successfully.");
                        manager.print();
                        break;

                    case 6:
                        System.out.println("Program ended.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1 to 6.");
                }

            } catch (NoItemsException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (OutOfBoundsException e) {

                System.out.println("Error: " + e.getMessage());
            }
        }

        keyboard.close();
    }
}