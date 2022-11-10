import java.util.Scanner;
public class Day28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String one");
        //Taking a String as input from the user
        String name1=sc.nextLine();
        System.out.println("Enter a String Two");
        //Taking a String as input from the user
        String name2=sc.nextLine();
        //Comparing the two strings
        if (name1.compareTo(name2)==0){
            //if the two strings are equal then the ouput will be String are equal
            System.out.println("Strings are equal");
        }else {
            //if the two strings are not equal then the output will be Strings are not equal
            System.out.println("Strings are not equal");
        }

    }
}
