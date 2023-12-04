import java.util.Scanner;

//question : Check Leap Year Or Not
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        long leapyear = sc.nextLong();

        if(leapyear%4 == 0){
            System.out.println(leapyear+" is a Leap Year");
        }else{
            System.out.println(leapyear+" is not a Leap Year");
        }
    }
}
