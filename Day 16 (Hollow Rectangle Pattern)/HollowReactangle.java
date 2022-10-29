public class HollowReactangle {
    public static void main(String[] args) {
        hollow_reactangle(4, 5);

    }

    public static void hollow_reactangle(int totRows, int totCols) {
        //outer loop
        for (int i = 1; i <= totRows; i++) {
            //inner-columns
            for (int j = 1; j <= totCols; j++) {
                //cell-(i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

        }
            System.out.println();
        }
    }
}
