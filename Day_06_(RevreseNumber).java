import java.util.Scanner;
public class RevreseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from user
        System.out.println("Enter any number");
        int n = sc.nextInt();
        //update reverse value in rev
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        //print output
        System.out.println(rev);
    }
}
