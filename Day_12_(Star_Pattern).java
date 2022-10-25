//This is a code to print a pattern of stars in the form of a triangle. The outer loop runs for the number of rows in the triangle and the inner loop runs for the number of columns.


public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        //outer loop for line
        for (int i = 1; i <= n; i++) {
            //loop for space 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //inner loop for printing star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output:
//              *
//             **
//            ***
//           ****
//          *****
