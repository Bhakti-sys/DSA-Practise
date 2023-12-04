//question: Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;

public class MaxMinFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find and print the maximum number
        int maxResult = findMax(num1, num2, num3);
        System.out.println("Maximum number: " + maxResult);

        // Find and print the minimum number
        int minResult = findMin(num1, num2, num3);
        System.out.println("Minimum number: " + minResult);

        scanner.close();
    }

    // Method to find the maximum among three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Method to find the minimum among three numbers
    public static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
