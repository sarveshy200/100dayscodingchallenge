import java.io.*;
import java.util.*;

public class Day32 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //Adding the length of the two strings
        System.out.println(A.length()+B.length());
        //Comparing the two strings
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }
        //Capitalizing the first letter of the two strings
        String atemp=A.substring(0,1).toUpperCase()+A.substring(1);
        String btemp=B.substring(0,1).toUpperCase()+B.substring(1);
        //Printing the two strings
        System.out.println(atemp+" "+btemp);


    }
}



