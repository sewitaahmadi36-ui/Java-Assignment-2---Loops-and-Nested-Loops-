// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 3.3 - Reverse a Number 
// Due Date: 12 October, 2026
import java.util.Scanner;

public class Task3_3_Ahmadi {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for a positive whole number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Store a copy of the number
        int temp = number;

        // Store the reversed number
        int reversed = 0;

        // Reverse the digits one at a time
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversed);

        input.close();
    }
}
