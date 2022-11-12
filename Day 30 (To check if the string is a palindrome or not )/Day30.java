import java.io.*;
import java.util.*;

public class Day30 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        //To check if the string is a palindrome or not
        boolean palindrome=true;
        /* Enter your code here. Print output to STDOUT. */
        //loop through the string
        for(int i=0;i<A.length()/2;i++){
            //check if the first and last characters are the same
            if(!A.substring(i,i+1).equals(A.substring(A.length()-i-1,A.length()-i))){
                //if they are not the same, then the string is not a palindrome
                palindrome=false;

            }

        }
        //print out the result
        if(palindrome){System.out.println("Yes");}
        //if the string is not a palindrome, print out "No"
        else{System.out.println("No");}
    }
}



