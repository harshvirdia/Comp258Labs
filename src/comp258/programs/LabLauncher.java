package comp258.programs;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import comp258.framework.ConsoleProgram;
import comp258.collections.LinkedList;
import comp258.programs.RecursiveFunctionsApp;

public class LabLauncher extends ConsoleProgram {

    private ConsoleProgram currentProgram;

    @Override
    public int showMenu() {
        System.out.println();
        System.out.println("========== COMP 258 LABS ==========");
        System.out.println("1. Manage data with ArrayManager");
        System.out.println("2. Manage data with LinkedList");
        System.out.println("3. Manage data with GenericLinkedList");
        System.out.println("4. Showcase Recursive Functions");
        System.out.println("5. Exit");
        System.out.println("===================================");

        int choice = readInt("Choose an option: ");

        // ConsoleProgram uses 0 internally to exit.
        return choice == 5 ? QUIT_OPTION : choice;
    }

    @Override
    public void executeAction(int choice) {
        switch (choice) {
            case 1:
                ArrayManagerDriver.main(new String[0]);
                break;

            case 2:
                currentProgram = new LinkedListDriver();
                currentProgram.run();
                break;

            case 3:
                GenericListTest.main(new String[0]);
                break;

            case 4:
                recursiveMenu();
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    private void recursiveMenu() {
        RecursiveFunctionsApp app = new RecursiveFunctionsApp();

        LinkedList numbers = new LinkedList();
        numbers.addAfter(10);
        numbers.addAfter(20);
        numbers.addAfter(30);

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("=== Recursive Functions Menu ===");
            System.out.println("1. Calculate factorial");
            System.out.println("2. Calculate powers");
            System.out.println("3. Check if a word is a palindrome");
            System.out.println("4. Print number's digit sum");
            System.out.println("5. Run Indent-o-tron");
            System.out.println("6. Print linked list with recursion");
            System.out.println("7. Print linked list backwards with recursion");
            System.out.println("8. Exit program");

            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1:
                    int n = readInt("Enter a number: ");
                    System.out.println("Factorial = " + app.factorial(n));
                    break;

                case 2:
                    int base = readInt("Enter base: ");
                    int exponent = readInt("Enter exponent: ");
                    System.out.println("Power = "
                            + app.calculatePower(base, exponent));
                    break;

                case 3:
                    String word = readString("Enter a word: ");
                    System.out.println("Palindrome = "
                            + app.isPalindrome(word));
                    break;

                case 4:
                    int number = readInt("Enter an integer: ");
                    System.out.println("Digit sum = "
                            + app.digitSum(number));
                    break;

                case 5:
                    int max = readInt("Enter maximum call number: ");
                    app.indentoTron(max);
                    break;

                case 6:
                    numbers.printRecursively();
                    break;

                case 7:
                    numbers.printBackwards();
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
