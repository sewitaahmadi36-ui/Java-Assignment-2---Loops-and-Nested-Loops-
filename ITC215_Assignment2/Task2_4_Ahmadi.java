// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 2.4 - Sum until zero (sentinel loop)
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task2_4_Ahmadi {
    public static void main(String[] args) {

        // we Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Store the running total
        int total = 0;

        // Count the nonzero numbers entered
        int count = 0;

        // Store the number entered by the user
        System.out.print("Enter a number (0 to stop): ");
        int number = input.nextInt();

        // Continue until the user enters zero
        while (number != 0) {
            total = total + number;
            count++;

            // Ask for the next number
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();
        }

        // Display the final total and count
        System.out.println("Total = " + total
                + " from " + count + " numbers");

        input.close();
    }
}
