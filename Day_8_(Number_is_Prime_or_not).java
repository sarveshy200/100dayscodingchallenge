//        The code is asking the user to enter a number and then checking
//        if that number is prime or not.
//        If it is, it prints out "Prime Number" and if not, it prints out "Not Prime Number".
//        The code is used to check if a number is prime or not prime.


import java.util.Scanner;
public class Day08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check weather a number is prime or not prime");
        int n= sc.nextInt();
        if (n==2){
            System.out.println(n+" is Prime Number");
        }
        else {
            boolean isPrime=true;
            for (int i=1;i<=n-1;i++){
                if (n%i==0){ //n is a multiple of i (i not equal to 1 or n)
                    isPrime=false;
                }
            }
            if (isPrime==true){
                System.out.println(n+" is a Prime Number");
            }
            else {
                System.out.println(n+" is not a Prime Number");
            }
        }

    }
}

//    Test Case 1:
//        Input: 7
//        Output: 7 is not a prime number
//
//        Test Case 2:
//        Input: 2
//        Output: 2 is a prime number
