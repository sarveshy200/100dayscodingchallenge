import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        String[] token = s.trim().split("[ !,?._'@]+");
        if(s.length()==0){
            System.out.println(0);
        }
        else{
            System.out.println(token.length);
        }
        for(String word:token){
            System.out.println(word);
        }
        scan.close();
    }
}

