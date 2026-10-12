// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 6.2 - Fibonacci sequence
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task6_2_Ahmadi {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask how many Fibonacci numbers to print
        System.out.print("How many terms? ");
        int terms = input.nextInt();

        // Store the first two Fibonacci numbers
        int first = 0;
        int second = 1;

        // Print the requested number of terms
        for (int i = 1; i <= terms; i++) {
            // Print the current Fibonacci number
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;

            // Move the numbers forward
            first = second;
            second = next;
        }

        // Move to the next line after printing
        System.out.println();

        input.close();
    }
}