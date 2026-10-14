/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

import comp258.collections.GenericList;
import comp258.collections.Widget;

public class GenericListTest {

    public static void main(String[] args) {

        // INTEGER TEST
        System.out.println("=== INTEGER TEST ===");

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Maximum: " + numbers.getMaximum());
        System.out.println("Current: " + numbers.getCurrent());

        // STRING TEST
        System.out.println("\n=== STRING TEST ===");

        GenericList<String> words = new GenericList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");

        System.out.println("Maximum: " + words.getMaximum());
        System.out.println("Current: " + words.getCurrent());

        // WIDGET TEST
        System.out.println("\n=== WIDGET TEST ===");

        GenericList<Widget> widgets = new GenericList<>();
        widgets.add(new Widget("Basic", 10.0));
        widgets.add(new Widget("Premium", 50.0));
        widgets.add(new Widget("Standard", 25.0));

        System.out.println("Maximum: " + widgets.getMaximum());
        System.out.println("Current: " + widgets.getCurrent());

        // EMPTY LIST TEST
        System.out.println("\n=== EMPTY LIST TEST ===");

        GenericList<Integer> empty = new GenericList<>();
        System.out.println("Maximum: " + empty.getMaximum());

        // LIST OPERATIONS TEST
        System.out.println("\n=== LIST OPERATIONS TEST ===");

        GenericList<Integer> list = new GenericList<>();
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Original list:");
        list.printList();

        System.out.println("Current item: " + list.getCurrent());

        list.advance();
        System.out.println("After advance: " + list.getCurrent());

        System.out.println("Maximum: " + list.getMaximum());
        System.out.println("Current after maximum: " + list.getCurrent());

        System.out.println("Removed item: " + list.removeCurrent());

        System.out.println("List after removal:");
        list.printList();
    }
}
