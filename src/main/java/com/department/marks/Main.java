package com.department.marks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("==================================");
            System.out.println("     STUDENT MARKS ANALYZER");
            System.out.println("==================================");

            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            if (numberOfStudents <= 0) {
                System.out.println("Error: Number of students must be positive.");
                return;
            }

            double[] marks = new double[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                System.out.print("Enter marks for student "
                        + (i + 1) + " (0-100): ");
                marks[i] = scanner.nextDouble();
            }

            MarksAnalyzer analyzer = new MarksAnalyzer(marks);

            System.out.println("\n========== ANALYSIS REPORT ==========");
            System.out.println("Total Students : "
                    + analyzer.getStudentCount());
            System.out.printf("Average Marks  : %.2f%n",
                    analyzer.getAverage());
            System.out.printf("Highest Marks  : %.2f%n",
                    analyzer.getHighestMark());
            System.out.printf("Pass Percentage: %.2f%%%n",
                    analyzer.getPassPercentage());
            System.out.println("=====================================");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");

        } finally {
            scanner.close();
        }
    }
}