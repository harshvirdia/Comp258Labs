/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.collections;

public class LinkedList {

    private ListNode items;
    private ListNode current;

    public LinkedList() {
        items = null;
        current = null;
    }

    // Start traversal
    public void start() {
        current = items;
    }

    // Add after current
    public void addAfter(Object item) {

        ListNode newNode = new ListNode(item);

        if (items == null) {
            items = newNode;
            current = newNode;
        }
        else if (current == null) {

            ListNode temp = items;

            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }

            temp.setNextNode(newNode);
            current = newNode;
        }
        else {

            newNode.setNextNode(current.getNextNode());
            current.setNextNode(newNode);
            current = newNode;
        }
    }

    // Get current item
    public Object getCurrent() {

        if (current == null) {
            return null;
        }

        return current.getData();
    }

    // Move to next node
    public boolean advance() {

        if (current == null ||
            current.getNextNode() == null) {
            return false;
        }

        current = current.getNextNode();
        return true;
    }

    // Delete current node
    public void deleteCurrent() {

        if (current == null) {
            return;
        }

        if (current == items) {
            items = current.getNextNode();
            current = items;
            return;
        }

        ListNode previous = items;

        while (previous.getNextNode() != current) {
            previous = previous.getNextNode();
        }

        previous.setNextNode(current.getNextNode());
        current = previous.getNextNode();
    }

    // Add before current
    public void addBefore(Object item) {

        ListNode newNode = new ListNode(item);

        if (items == null) {
            items = newNode;
            current = newNode;
            return;
        }

        if (current == null) {
            newNode.setNextNode(items);
            items = newNode;
            current = newNode;
            return;
        }

        if (current == items) {
            newNode.setNextNode(items);
            items = newNode;
            current = newNode;
            return;
        }

        ListNode previous = items;

        while (previous.getNextNode() != current) {
            previous = previous.getNextNode();
        }

        newNode.setNextNode(current);
        previous.setNextNode(newNode);
        current = newNode;
    }

    // Print all items
        public void print() {

        ListNode temp = items;

        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNextNode();
        }
                while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNextNode();
        }
    }
    
    // Print all items backwards using recursion
    public void printBackwards() {
        if (items == null) {
            System.out.println("List is empty.");
            return;
        }

        printBackwardsRecursive(items);
    }

    // Recursive helper method
    private void printBackwardsRecursive(ListNode node) {
        if (node == null) {
            return;
        }

        printBackwardsRecursive(node.getNextNode());

        System.out.println(node.getData());
    }
    
    // Print all items forwards using recursion
    public void printRecursively() {
        if (items == null) {
            System.out.println("List is empty.");
            return;
        }

        printForwardRecursive(items);
    }

    private void printForwardRecursive(ListNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.getData());
        printForwardRecursive(node.getNextNode());
    }


 }