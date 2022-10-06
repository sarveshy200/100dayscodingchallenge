//The code asks the user to enter a number.
//The code then checks if the number is even or odd and prints out the sum of even and odd numbers.
//The code asks the user to enter a number and then displays the sum of even and odd numbers.

import java.util.Scanner;
public class Day_9_sum_of_even_number_and_odd_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evennumber=0;
        int oddnumber=0;
        do {
            System.out.println("Enter a number");
            number = sc.nextInt();
            if (number%2==0){
                evennumber=evennumber+number;
            }
            else {
                oddnumber=oddnumber+number;
            }
            System.out.println("Do you want to continue? press 1 for yes or 0 for no");
            choice= sc.nextInt();

        }while (choice==1);
        System.out.println("Sum of even number: "+evennumber);
        System.out.println("Sum of odd number: "+oddnumber);

    }
}
//Test Case 1:
//Enter a number
//        2
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        4
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        6
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        8
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        10
//        Do you want to continue? press 1 for yes or 0 for no
//        0
//        Sum of even number: 30
//        Sum of odd number: 0



//Test case 2:

//Enter a number
//        3
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        5
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        6
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        7
//        Do you want to continue? press 1 for yes or 0 for no
//        1
//        Enter a number
//        9
//        Do you want to continue? press 1 for yes or 0 for no
//        0
//        Sum of even number: 6
//        Sum of odd number: 24


