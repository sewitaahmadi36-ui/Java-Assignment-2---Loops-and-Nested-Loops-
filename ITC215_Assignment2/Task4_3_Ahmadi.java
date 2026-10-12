// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 4.3 - Right_angled traingle
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task4_3_Ahmadi {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Outer loop controls the rows
        for (int row = 1; row <= rows; row++) {

            // Inner loop prints stars for the current row
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        input.close();
    }
}