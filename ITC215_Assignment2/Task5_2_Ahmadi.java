// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 5.2 - Inverted triangle and number pyramid
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task5_2_Ahmadi {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the height
        System.out.print("Enter the height: ");
        int height = input.nextInt();

        // Pattern A: Print the inverted triangle
        for (int row = height; row >= 1; row--) {
            // Print stars for the current row
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Print a blank line between the patterns
        System.out.println();

        // Pattern B: Print the number triangle
        for (int row = 1; row <= height; row++) {
            // Print numbers from 1 to the current row
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // Move to the next line
            System.out.println();
        }

        input.close();
    }
}
