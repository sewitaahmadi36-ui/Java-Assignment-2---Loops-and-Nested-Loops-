// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 3.2 - Count digits and sum of digits
// Due Date: 12 October, 2026
import java.util.Scanner;

public class Task3_2_Ahmadi {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for a positive whole number
        System.out.print("Enter a positive whole number: ");
        int number = input.nextInt();

        // Store a copy so the original number stays unchanged
        int temp = number;

        // Count the digits
        int digitCount = 0;

        // Store the sum of the digits
        int digitSum = 0;

        // Process each digit until no digits remain
        while (temp > 0) {
            int digit = temp % 10;
            digitSum = digitSum + digit;
            digitCount++;
            temp = temp / 10;
        }

        // Treat zero as a one-digit number
        if (number == 0) {
            digitCount = 1;
        }

        // Display the results
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);

        input.close();
    }
}