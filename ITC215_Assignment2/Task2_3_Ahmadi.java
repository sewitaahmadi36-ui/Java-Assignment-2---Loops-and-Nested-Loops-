// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 2.3 - Countdown
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task2_3_Ahmadi {
    public static void main(String[] args) {

        //  we Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the starting number
        System.out.print("Enter start number: ");
        int number = input.nextInt();

        // Count down from the starting number to 1
        while (number >= 1) {
            System.out.println(number);
            number--;
        }

        // Print Liftoff after the countdown
        System.out.println("Liftoff!");

        input.close();
    }
}
