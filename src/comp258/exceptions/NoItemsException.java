/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.exceptions;

public class NoItemsException extends Exception {

    public NoItemsException() {
        super("No items are available.");
    }

    public NoItemsException(String message) {
        super(message);
    }
}
