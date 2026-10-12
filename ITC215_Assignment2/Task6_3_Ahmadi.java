//Name: Sewita Ahmadi
//Course: ITC 215 - Introduction to Programming with Java
//Assignment: Assignment 2 - Loops and Nested Loops
//Task: 6.3 - Student Results Summary
//Due Date: October 12, 2026


import java.util.Scanner;

public class Task6_3_Ahmadi {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Ask for the number of students
        System.out.print("Number of students: ");
        int students = input.nextInt();

        // Ask for the number of exam scores per student
        System.out.print("Scores per student: ");
        int scoresPerStudent = input.nextInt();

        // Store the total of all scores in the class
        double classTotal = 0;

        // Count all scores entered
        int totalScores = 0;

        // Store the highest score found so far
        int highestScore = -1;

        // Store the student number with the highest score
        int highestStudent = 0;

        // Outer loop processes each student
        for (int student = 1; student <= students; student++) {

            // Store the total scores for the current student
            double studentTotal = 0;

            // Inner loop processes each exam score
            for (int exam = 1; exam <= scoresPerStudent; exam++) {

                // Ask for the current exam score
                System.out.print(
                    "Student " + student + ", score " + exam + ": "
                );

                // Read the exam score
                int score = input.nextInt();

                // Check that the score is between 0 and 100
                while (score < 0 || score > 100) {
                    System.out.print(
                        "Invalid score. Enter a score between 0 and 100: "
                    );
                    score = input.nextInt();
                }

                // Add the score to the student's total
                studentTotal += score;

                // Add the score to the class total
                classTotal += score;

                // Increase the number of scores entered
                totalScores++;

                // Check whether this is the highest score
                if (score > highestScore) {
                    highestScore = score;
                    highestStudent = student;
                }
            }

            // Calculate the current student's average
            double studentAverage = studentTotal / scoresPerStudent;

            // Print the student's average
            System.out.printf(
                "Student " + student + " average: %.2f%n",
                studentAverage
            );
        }

        // Calculate the class average
        double classAverage = classTotal / totalScores;

        // Print the class average
        System.out.printf("Class average: %.2f%n", classAverage);

        // Print the highest score and the student who earned it
        System.out.println(
            "Highest score: " + highestScore
            + " (Student " + highestStudent + ")"
        );

        // Close the Scanner
        input.close();
    }
}