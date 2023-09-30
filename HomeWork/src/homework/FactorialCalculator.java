/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

/**
 *
 * @author ivanp
 */

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this number to calculate the factorial of a different value
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
