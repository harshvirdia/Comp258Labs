/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_Lab03;

import java.util.LinkedList;

public class BuiltInLinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(7);
        list.add(25);
        list.add(4);
        list.add(18);

        // 1. Display number of items
        System.out.println("Number of items: " + list.size());

        // 2. Display all items
        System.out.println("All items:");
        for (int item : list) {
            System.out.println(item);
        }

        // 3. Add 30 to end
        list.add(30);
        System.out.println("After adding 30: " + list);

        // 4. Add 15 at position 2
        list.add(2, 15);
        System.out.println("After adding 15: " + list);

        // 5. Remove item at position 4
        list.remove(4);
        System.out.println("After removing index 4: " + list);

        // 6. Get item at index 4
        System.out.println("Item at index 4: " + list.get(4));

        // 7. Replace item at position 4
        list.set(4, 18);
        System.out.println("After replacement: " + list);

        // 8. Add to front
        list.addFirst(100);
        System.out.println("After adding to front: " + list);

        // 9. Add to end
        list.addLast(200);
        System.out.println("After adding to end: " + list);

        // 10. Remove first
        list.removeFirst();
        System.out.println("After removing first: " + list);

        // 11. Remove last
        list.removeLast();
        System.out.println("After removing last: " + list);
    }
}