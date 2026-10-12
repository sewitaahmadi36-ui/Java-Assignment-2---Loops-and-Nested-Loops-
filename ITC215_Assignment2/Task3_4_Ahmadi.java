// Name: Sewita Ahmadi
// Course: ITC 215 - Introduction to Programming with Java
// Assignmment: Assignmment 2 - Loops and Nested Loops
// Task 3.4 - Class score: average, highest, and lowest
// Due Date: 12 October, 2026

import java.util.Scanner;

public class Task3_4_Ahmadi {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask how many scores will be entered
        System.out.print("How many scores? ");
        int numberOfScores = input.nextInt();

        // Initialize the total
        double total = 0;

        // Read the first score to initialize highest and lowest
        System.out.print("Score 1: ");
        double score = input.nextDouble();

        double highest = score;
        double lowest = score;
        total = total + score;

        // Read the remaining scores
        for (int i = 2; i <= numberOfScores; i++) {
            System.out.print("Score " + i + ": ");
            score = input.nextDouble();

            total = total + score;

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }
        }

        // Calculate the average
        double average = total / numberOfScores;

        // Display the results
        System.out.printf("Average = %.2f%n", average);
        System.out.printf("Highest = %.0f%n", highest);
        System.out.printf("Lowest = %.0f%n", lowest);

        input.close();
    }
}
