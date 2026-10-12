// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 5.1 - Multiplacation Table grid
// Due Date: 12 October, 2026
import java.util.Scanner;

public class Task5_1_Ahmadi {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the table
        System.out.print("Enter the size: ");
        int size = input.nextInt();

        // Outer loop controls the rows
        for (int row = 1; row <= size; row++) {

            // Inner loop controls the columns
            for (int col = 1; col <= size; col++) {
                // Print the product followed by a tab
                System.out.print((row * col) + "\t");
            }

            // Move to the next row
            System.out.println();
        }

        input.close();
    }
}
