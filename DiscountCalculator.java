import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original price of the product: $");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        if (originalPrice < 0 || discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid input. Please enter valid values.");
        } else {
            double discountedPrice = calculateDiscountedPrice(originalPrice, discountPercentage);
            double discountAmount = originalPrice - discountedPrice;

            System.out.println("Original Price: $" + originalPrice);
            System.out.println("Discount Percentage: " + discountPercentage + "%");
            System.out.println("Discounted Price: $" + discountedPrice);
            System.out.println("Discount Amount: $" + discountAmount);
        }

        scanner.close();
    }

    private static double calculateDiscountedPrice(double originalPrice, double discountPercentage) {
        double discountFraction = discountPercentage / 100.0;
        return originalPrice - (originalPrice * discountFraction);
    }
}
