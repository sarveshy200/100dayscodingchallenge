public class Pattern12 {
    public static void DiamondPattern(int n) {
        //1st Half
        //outer loop for number
        for (int i = 1; i <= n; i++) {
            //Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            //Next Line
            System.out.println();
        }
        //2nd Half
        for (int i = n; i >= 1; i--) {
            //Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            //Next Line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Method Call
        DiamondPattern(5);
    }
}
