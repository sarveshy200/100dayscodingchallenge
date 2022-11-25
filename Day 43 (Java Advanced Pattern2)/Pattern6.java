public class Pattern6 {
    public static void FloydsTriangle(int n){
        //counter for number
        int counter=1;
        //outer loop for line
        for (int i=1;i<=n;i++){
            //inner loop for no. of col
            for (int j=1;j<=i;j++){
                //print counter
                System.out.print(counter+" ");
                //increment counter
                counter++;
            }
            //for next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //calling method
        FloydsTriangle(10);
    }
}
