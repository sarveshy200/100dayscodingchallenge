public class Pattern16 {
    public static void PalindromicPattern(int n){
        //Loop For Line
        for (int i=1;i<=n;i++){
            //Loop For Space
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Loop For Decending Number
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            //Loop For Ascending Number
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PalindromicPattern(5);
    }
}
