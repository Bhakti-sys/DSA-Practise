import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                double circleArea = calculateCircleArea(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;
            case 2:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
            case 3:
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                double squareArea = calculateSquareArea(side);
                System.out.println("Area of the square: " + squareArea);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    private static double calculateSquareArea(double side) {
        return side * side;
    }
}
