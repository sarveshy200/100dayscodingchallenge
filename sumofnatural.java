import java.util.Scanner;
public class sumofnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        //take sum=0 after check condition the value of sum is change
        int sum=0;
        int i=1;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        //sum of n natural number output print
        System.out.print("sum is:" + sum);


    }
}
