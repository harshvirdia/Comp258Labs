/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_Lab03;

public class LinkedListDriver extends ConsoleProgram {

    private LinkedList list;

    public LinkedListDriver() {
        list = new LinkedList();
    }

    @Override
    public int showMenu() {

        System.out.println();
        System.out.println("============ MENU ============");
        System.out.println("1. Add Before");
        System.out.println("2. Add After");
        System.out.println("3. Print");
        System.out.println("4. Get Current");
        System.out.println("5. Get Item At");
        System.out.println("6. Delete Current");
        System.out.println("7. Advance");
        System.out.println("8. Start");
        System.out.println("9. Run Test");
        System.out.println("0. Exit Program");

        return readInt("Enter your choice: ");
    }

    @Override
    public void executeAction(int choice) {

        switch (choice) {

            case 1:
                int before = readInt("Enter value: ");
                list.addBefore(before);
                System.out.println("Item added.");
                break;

            case 2:
                int after = readInt("Enter value: ");
                list.addAfter(after);
                System.out.println("Item added.");
                break;

            case 3:
                list.print();
                break;

            case 4:
                System.out.println(
                    "Current item: " + list.getCurrent());
                break;

            case 5:
                getItemAt();
                break;

            case 6:
                list.deleteCurrent();
                System.out.println("Delete operation completed.");
                break;

            case 7:
                if (list.advance()) {
                    System.out.println(
                        "Current item: " + list.getCurrent());
                } else {
                    System.out.println("Cannot advance.");
                }
                break;

            case 8:
                list.start();
                System.out.println("Traversal started.");
                break;

            case 9:
                runLinkedListTest();
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }

    private void getItemAt() {

        int index = readInt("Enter index: ");

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        list.start();

        if (list.getCurrent() == null) {
            System.out.println("List is empty.");
            return;
        }

        for (int i = 0; i < index; i++) {

            if (!list.advance()) {
                System.out.println("Invalid index.");
                return;
            }
        }

        System.out.println(
            "Item: " + list.getCurrent());
    }

    private void runLinkedListTest() {

        LinkedList test = new LinkedList();

        test.addAfter(5);
        test.addAfter(6);
        test.addAfter(7);
        test.addAfter(8);
        test.addAfter(9);
        test.addAfter(10);
        test.addAfter(11);
        test.addAfter(12);

        System.out.println("Test Results:");
        test.print();
    }

    public static void main(String[] args) {

        LinkedListDriver program = new LinkedListDriver();

        program.run();
    }
}