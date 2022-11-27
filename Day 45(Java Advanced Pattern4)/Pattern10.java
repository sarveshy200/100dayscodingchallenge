public class Pattern10 {
    public static void SolidRhombus(int n){
        for (int i=1;i<=n;i++) {
            //Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            //Next Line
            System.out.println();
        }


    }
    public static void main(String[] args) {
        SolidRhombus(5);
    }
}
