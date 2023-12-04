// question: Write a program to print the sum of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Call the custom method to calculate the sum
        double sum = calculateSum(num1, num2);

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Custom method to calculate the sum of two numbers
    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }
}
