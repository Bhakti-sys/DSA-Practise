//question: Write a function that returns all prime numbers between two given numbers.

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

    // Function to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to find all prime numbers between two given numbers
    public static List<Integer> findPrimesBetween(int start, int end) {
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        // Test the findPrimesBetween function
        int start = 10;
        int end = 50;

        List<Integer> primeNumbers = findPrimesBetween(start, end);

        System.out.println("Prime numbers between " + start + " and " + end + ": " + primeNumbers);
    }
}
