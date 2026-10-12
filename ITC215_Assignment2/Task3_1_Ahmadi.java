// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 3.1 - Factorial
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task3_1_Ahmadi {
    public static void main(String[] args) {

        // we create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for a number from 1 to 15
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the factorial result
        long factorial = 1;

        // Multiply the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        // Display the factorial
        System.out.println(number + "! = " + factorial);

        input.close();
    }
}