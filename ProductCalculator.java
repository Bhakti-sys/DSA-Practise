//question: Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Get user input for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate and display the product using the getProduct method
        double product = getProduct(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Method to calculate the product of two numbers
    public static double getProduct(double num1, double num2) {
        return num1 * num2;
    }
}
