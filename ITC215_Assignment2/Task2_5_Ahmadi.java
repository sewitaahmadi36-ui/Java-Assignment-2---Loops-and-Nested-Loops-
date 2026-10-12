// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 2.5 - Input Validation with-while
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task2_5_Ahmadi {
    public static void main(String[] args) {

        // we create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Store the mark entered by the user
        int mark;

        // Ask for a mark at least once
        do {
            System.out.print("Enter a mark between 0 and 100: ");
            mark = input.nextInt();

            // Display an error if the mark is invalid
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Try again.");
            }

        } while (mark < 0 || mark > 100);

        // Display the accepted mark
        System.out.println("Mark accepted: " + mark);

        input.close();
    }
}