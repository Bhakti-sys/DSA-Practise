import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = calculateSum(n);
            System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }

    private static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}
