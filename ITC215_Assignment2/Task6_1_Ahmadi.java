// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 6.1 - Prime Numbers up to N
// Due Date: 12 October, 2026
import java.util.Scanner;

public class Task6_1_Ahmadi {
    public static void main(String[] args) {
        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user for the maximum number
        System.out.print("Enter N: ");
        int n = input.nextInt();

        // Count how many prime numbers are found
        int primeCount = 0;

        // Check every number from 2 to N
        for (int number = 2; number <= n; number++) {

            // Assume the current number is prime
            boolean isPrime = true;

            // Check possible divisors
            for (int divisor = 2; divisor < number; divisor++) {
                // If divisible evenly, the number is not prime
                if (number % divisor == 0) {
                    isPrime = false;
                }
            }

            // Print and count prime numbers
            if (isPrime) {
                System.out.print(number + " ");
                primeCount++;
            }
        }

        // Print the total number of primes found
        System.out.println();
        System.out.println("Primes found: " + primeCount);

        input.close();
    }
}