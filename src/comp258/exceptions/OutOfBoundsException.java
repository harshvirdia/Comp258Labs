package comp258.exceptions;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class OutOfBoundsException extends Exception {

    public OutOfBoundsException() {
        super("Index is out of bounds.");
    }

    public OutOfBoundsException(String message) {
        super(message);
    }
}
