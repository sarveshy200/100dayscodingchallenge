//The code is a program that asks the user for an integer and then prints out if it is a leap year or not.
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //The code starts by using the Scanner class to ask the user for input.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A year");
        //It then uses nextInt() to get an integer from the user, which will be stored in variable "year".
        int year= sc.nextInt();
        //checks if this number is divisible by 4 .
        boolean x=(year%4)==0;
        //checks if this number is divisible by 100 .
        boolean y=(year %100) !=0;
        //checks if this number is divisible by 100 AND 400.
        boolean z= ((year%100==0)&&(year%400==0));
        if (x && (y||z)){
            //The code will print "This is a leap year" if the year is a leap year and not otherwise.
            System.out.println(year+"This is a leap year");
        }
        else {
            System.out.println(year+"This is not a leap Year");
        }
    }
}
