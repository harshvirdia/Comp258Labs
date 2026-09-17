/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comp258_Lab02;

public class OutOfBoundsException extends Exception {

    public OutOfBoundsException() {
        super("The position is outside the valid range.");
    }
}