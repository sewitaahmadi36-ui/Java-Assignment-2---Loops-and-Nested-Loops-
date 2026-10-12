// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 2.2 - Sum of 1 to N 
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task2_2_Ahmadi {
    public static void main(String[] args) {

        // we Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Store the whole number entered by the user
        System.out.print("Enter N: ");
        int n = input.nextInt();
        
        // Store the running sum, starting at zero
        int total = 0;

        // Add each number from 1 to n
        for (int number = 1; number <= n; number++) {
            total = total + number;
        }

        System.out.println("The sum of 1 to " + n     // Display the final sum
                + " is " + total);

        input.close();
    }
}
