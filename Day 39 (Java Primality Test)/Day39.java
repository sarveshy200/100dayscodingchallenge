import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        BigInteger n=new BigInteger(bufferedReader.readLine());
        System.out.println(n.isProbablePrime(1)?"prime":"not prime");


        bufferedReader.close();
    }
}
