//question: Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        // Test the isPalindrome function
        Scanner sc = new Scanner(System.in);
        int testNumber = sc.nextInt(); // Change this to test a different number
        if (isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
}
