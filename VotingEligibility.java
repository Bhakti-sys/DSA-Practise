//question: A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class VotingEligibility {

    // Function to check if a person is eligible to vote
    static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Checking eligibility and displaying the result
        if (isEligibleToVote(age)) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        scanner.close();
    }
}
