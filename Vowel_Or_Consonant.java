//question : Java Program Vowel Or Consonant

import java.util.Scanner;

public class Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

            System.out.println(ch + " is a vowel");
        } else{
            System.out.println(ch + " is a consonant");
        }



    }
}
