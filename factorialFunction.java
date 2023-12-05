import java.util.Scanner;

//question: Write a program to print the factorial of a number
public class factorialFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);
    }

    static void factorial(int num){
        int product = 1;
        for (int i = num ; i >0 ; i--) {
            product = product * i;
        }
        System.out.println(product);
    }
}
