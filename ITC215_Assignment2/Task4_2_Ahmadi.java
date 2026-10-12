// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 4.2 - Rectangle of stars
// Due Date: 12 October, 2026
import java.util.Scanner;

public class Task4_2_Ahmadi {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask for the number of rows
        System.out.print("Rows: ");
        int rows = input.nextInt();

        // Ask for the number of columns
        System.out.print("Columns: ");
        int columns = input.nextInt();

        // Outer loop controls the rows
        for (int row = 1; row <= rows; row++) {

            // Inner loop prints stars in each row
            for (int col = 1; col <= columns; col++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }

        input.close();
    }
}