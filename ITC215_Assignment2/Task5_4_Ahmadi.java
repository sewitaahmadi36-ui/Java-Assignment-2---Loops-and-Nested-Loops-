// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 5.4 _ Diamond
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task5_4_Ahmadi {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the top half height
        System.out.print("Enter the height: ");
        int height = input.nextInt();

        // Print the top half of the diamond
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

        // Print the bottom half without repeating the widest row
        for (int row = height - 1; row >= 1; row--) {

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