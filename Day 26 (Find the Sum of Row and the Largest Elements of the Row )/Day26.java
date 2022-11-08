public class Day26 {
    public static void main(String[] args) {
        TwoDimArrayMethods operate = new TwoDimArrayMethods();
        int[][] board   =
                {
                        { 20, 15, 6, 19, 18 }, { 4, 46, 24, 17, 18 },
                        { 12, 50, 23, 16, 31 }
                };

        operate.printMatrix(board);
        // print the sum of the array
        System.out.println();
        operate.sumRows(board);
        // print the sum of the columns
        System.out.println();
        operate.largestInRows(board);

    }

    public static class TwoDimArrayMethods
    {
        public void printMatrix(int[][] matrix)
        {
            // print the matrix
            for (int row = 0; row < matrix.length; row++)
            {
                // print the row
                for (int col = 0; col < matrix[row].length; col++)
                {
                    // print the element
                    System.out.printf("%7d", matrix[row][col]);
                }

                System.out.println();
            }
        }

        public void sumRows(int[][] matrix)
        {
            // print the sum of each row
            int sum;

            // sum of each individual row
            for (int row = 0; row < matrix.length; row++)
            {
                sum = 0;
                // sum of each individual column

                for (int col = 0; col < matrix[row].length; col++)
                {
                    // sum the elements
                    sum = sum + matrix[row][col];
                }

                // print the sum
                System.out.println("The sum of row " + (row + 1) + " = "
                        + sum);
            }
        }

        public void largestInRows(int[][] matrix)
        {
            int largest;

            for (int row = 0; row < matrix.length; row++)
            {
                // assume that the first element of the row is largest
                largest = matrix[row][0];
                // compare the rest of the elements in the row
                for (int col = 1; col < matrix[row].length; col++)
                {
                    // if the elements is larger than the largest
                    if (largest < matrix[row][col])
                    {
                        // upadte the largest
                        largest = matrix[row][col];
                    }
                }
                // print the largest
                System.out.println("The largest element of row " + (row + 1)
                        + " = " + largest);
            }
        }
    }
}
