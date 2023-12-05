//question: Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Arrays;

public class PythagoreanTripletChecker {

    // Function to check if a triplet is a Pythagorean triplet
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Ensure that the input values are positive
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Arrange the numbers in ascending order
        int[] triplet = {a, b, c};
        Arrays.sort(triplet);

        // Check the Pythagorean condition
        return triplet[0] * triplet[0] + triplet[1] * triplet[1] == triplet[2] * triplet[2];
    }

    public static void main(String[] args) {
        // Test the isPythagoreanTriplet function
        int testA = 3;
        int testB = 4;
        int testC = 5;

        if (isPythagoreanTriplet(testA, testB, testC)) {
            System.out.println("(" + testA + ", " + testB + ", " + testC + ") is a Pythagorean triplet.");
        } else {
            System.out.println("(" + testA + ", " + testB + ", " + testC + ") is not a Pythagorean triplet.");
        }
    }
}

