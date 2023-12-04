//question: Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class EvenOddChecker {

    // Function to check whether a number is even or odd
    static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Call the function and display the result
        String result = checkEvenOdd(userInput);
        System.out.println("The number " + userInput + " is " + result + ".");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
