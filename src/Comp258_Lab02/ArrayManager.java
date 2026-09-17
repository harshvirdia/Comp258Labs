/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_Lab02;

public class ArrayManager {

    private int[] items;
    private int count;

    // Start with an empty list of size 10
    public ArrayManager() {
        items = new int[10];
        count = 0;
    }

    // Create an empty list using the given capacity
    public ArrayManager(int capacity) {
        items = new int[capacity];
        count = 0;
    }

    // Copy the values into the manager
    public ArrayManager(int[] values) {
        items = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            items[i] = values[i];
        }

        count = values.length;
    }

    // Give back the number of stored items
    public int size() {
        return count;
    }

    // Display the values currently being used
    public void print() {
        System.out.print("Items: ");

        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }

        System.out.println();
    }

    // Add a new value at the end
    public void add(int n) {

        // Make a bigger array when there is no room left
        if (count == items.length) {
            int[] biggerArray = new int[items.length * 2];

            for (int i = 0; i < count; i++) {
                biggerArray[i] = items[i];
            }

            items = biggerArray;
        }

        items[count] = n;
        count++;
    }

    // Remove a value and move the remaining values left
    public void remove(int pos) throws NoItemsException {

        if (count == 0) {
            throw new NoItemsException();
        }

        for (int i = pos; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    // Insert a value at the selected position
    public void addAt(int n, int pos) throws OutOfBoundsException {

        if (pos < 0 || pos > count) {
            throw new OutOfBoundsException();
        }

        // Make extra space if the current array is full
        if (count == items.length) {
            int[] biggerArray = new int[items.length * 2];

            for (int i = 0; i < count; i++) {
                biggerArray[i] = items[i];
            }

            items = biggerArray;
        }

        // Move values one place to the right
        for (int i = count; i > pos; i--) {
            items[i] = items[i - 1];
        }

        items[pos] = n;
        count++;
    }

    // Check whether the manager has no values
    public boolean isEmpty() {
        return count == 0;
    }
}