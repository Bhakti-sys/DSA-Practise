//question  : Reverse A String In Java

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine();
        String new_a = "";
        char ch;

        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            new_a = ch + new_a;
        }
        System.out.println("Reserse of the string is : "+new_a);
    }

}
