/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_lab02;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Make a list and put the starting numbers in it
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(7);
        numbers.add(25);
        numbers.add(4);
        numbers.add(18);

        // Show how many numbers are in the list
        System.out.println("Number of items: " + numbers.size());

        // Print each number one by one
        System.out.println("All items:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Put 30 at the end of the list
        numbers.add(30);
        System.out.println("\nAfter adding 30: " + numbers);

        // Put 15 into position 2
        numbers.add(2, 15);
        System.out.println("After inserting 15 at index 2: " + numbers);

        // Delete the number at position 4
        numbers.remove(4);
        System.out.println("After removing item at index 4: " + numbers);

        // Check the number at position 3
        System.out.println("Item at index 3: " + numbers.get(3));

        // Replace the first number with 100
        numbers.set(0, 100);
        System.out.println("After changing index 0 to 100: " + numbers);

        // Show the final list
        System.out.println("Completed ArrayList: " + numbers);
    }
}