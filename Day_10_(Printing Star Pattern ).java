//The code is a loop that prints the number of Star on the screen.
// The code prints the number of times you want to print Star.

import java.util.Scanner;
public class DAy10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input from user
        System.out.print("Enter how many times you want to print Star: ");
        int n= sc.nextInt();
        //inner loop for line
        for (int i=1;i<=n;i++){
            //outer loop for printing "*"
            for (int j=1;j<=i;j++){
                //For printing Star
                System.out.print("*");
            }
            //For moving to the next line
            System.out.println();
        }

    }
}

//Test Case 1:
//input :
//5
//output:
//*
//**
//***
//****
//*****

//Test Case 2:
//input :
//8
//output:
//*
//**
//***
//****
//*****
//******
//*******
//********


