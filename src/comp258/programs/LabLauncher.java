package comp258.programs;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import comp258.framework.ConsoleProgram;

public class LabLauncher extends ConsoleProgram {

    private ConsoleProgram currentProgram;

    @Override
    public int showMenu() {
        System.out.println();
        System.out.println("========== COMP 258 LABS ==========");
        System.out.println("1. Random Number App");
        System.out.println("2. Array Manager App");
        System.out.println("3. Linked List App");
        System.out.println("4. Generic List App");
        System.out.println("0. Exit");
        System.out.println("===================================");

        return readInt("Choose lab application: ");
    }

   @Override
public void executeAction(int choice) {
    switch (choice) {
        case 1:
            System.out.println("Random Number App is not connected yet.");
            break;

        case 2:
            ArrayManagerDriver.main(new String[0]);
            break;

        case 3:
            currentProgram = new LinkedListDriver();
            currentProgram.run();
            break;

        case 4:
            GenericListTest.main(new String[0]);
            break;

        case QUIT_OPTION:
            break;

        default:
            System.out.println("Invalid option.");
            break;
    }
}

}
