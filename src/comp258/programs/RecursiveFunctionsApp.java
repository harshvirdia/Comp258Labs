/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp258.programs;

public class RecursiveFunctionsApp {

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Number cannot be negative."
            );
        }

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public int calculatePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException(
                "Exponent cannot be negative."
            );
        }

        if (exponent == 0) {
            return 1;
        }

        return base * calculatePower(base, exponent - 1);
    }

    public boolean isPalindrome(
            String word, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (Character.toLowerCase(word.charAt(start))
                != Character.toLowerCase(word.charAt(end))) {
            return false;
        }

        return isPalindrome(word, start + 1, end - 1);
    }

    public boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }

        return isPalindrome(word, 0, word.length() - 1);
    }

    public int digitSum(int number) {
        number = Math.abs(number);

        if (number < 10) {
            return number;
        }

        return number % 10 + digitSum(number / 10);
    }

    public void indentoTron(int currentNum, int maxNum) {
        if (currentNum > maxNum) {
            return;
        }

        String indent = "    ".repeat(currentNum);

        System.out.println(indent
                + "This was written by call number "
                + currentNum + ".");

        if (currentNum < maxNum) {
            indentoTron(currentNum + 1, maxNum);
        }

        System.out.println(indent
                + "This ALSO written by call number "
                + currentNum + ".");
    }

    public void indentoTron(int maxNum) {
        if (maxNum >= 1) {
            indentoTron(1, maxNum);
        }
    }
}
