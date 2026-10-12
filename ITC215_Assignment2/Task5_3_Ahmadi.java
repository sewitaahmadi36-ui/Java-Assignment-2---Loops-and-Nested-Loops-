// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 5.3 - Centered Pyramid
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task5_3_Ahmadi {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the pyramid height
        System.out.print("Enter the height: ");
        int height = input.nextInt();

        // Outer loop controls the rows
        for (int row = 1; row <= height; row++) {

            // Print spaces before the stars
            for (int space = 1; space <= height - row; space++) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        input.close();
    }
}