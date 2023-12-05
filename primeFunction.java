//question : Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class primeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        prime(num);

    }
    static void prime(int num) {
        int check =2;
        if(num<=1){
            System.out.println("Not prime");
        }
        for (int i = 2; i <= num ; i++) {
            if(num==i){
                System.out.println("Prime");
                break;
            }
            else if (num%i==0){
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
                break;
            }
        }
    }
}
