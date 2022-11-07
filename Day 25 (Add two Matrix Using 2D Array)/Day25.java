
public class Day25 {
    public static void main(String[] args) {

        int [][] mat1={{1,2,3},
                      {4,5,6}};
        int [][] mat2={{2,6,13},
                       {3,7,1 }};
        int [][] result={{0,0,0},
                         {0,0,0}};
        //loop through the rows
        for(int i=0;i<mat1.length;i++){
            //loop through the columns
            for (int j=0;j<mat1[i].length;j++){
                //add the elements of the same position
                result[i][j]=mat1[i][j]+mat2[i][j];
                //print the elements of the result matrix
                System.out.print(result[i][j]+" ");
            }
            //print a new line
            System.out.println(" ");
        }
    }
}
