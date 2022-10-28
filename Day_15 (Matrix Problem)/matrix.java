//The code is a function that sums the values of each row and column.
//The code starts by printing "The sum of each row" to the console, then loops through all the rows in a matrix.
//It prints out "The sum of each element" for every iteration, then adds up all the elements in that row.
//After it has done this for all rows, it does the same thing with columns.
//In order to do this, we need an array called a which is initialized with three different arrays: {1, 5, 5}, {7, 9, 8}, and {3, 7, 5}.
//In order to loop through these arrays we use i as our index variable (which stands for "index").
//We can also see how many elements there are in each array using j as our index variable (which stands for "joint").
//For example: for (int[] i : a) { sum = 0; for (int j : i) { We start at 1 and go down until we hit 3 on line 2.
//Then on line 3 we print out what value was found at that position on line 2 - here it would be 1 because there were only
//The code creates a matrix with three rows and three columns.

//This code calculates the sum of each row, column, and element in a 3x3 matrix. It also finds the column and row with the greatest sum.


public class matrix2 {
    static int sum = 0;
    static int[][] a = {
            {1, 5, 5},
            {7, 9, 8},
            {3, 7, 5}
    };

    static void sumofrow() {//sum of row
        System.out.println("The sum of each row");
        for (int[] i : a) {
            sum = 0;
            for (int j : i) {
                sum = sum + j;

            }
            System.out.println(sum);
        }
    }

    static void sumofcolumn() {//sum of column
        System.out.println("The sum of each Column");
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + a[i][j];

            }
            System.out.println(sum);
        }
    }

    static void sum() {//sum of each element
        System.out.println("The sum of each element");
        sum = 0;
        for (int[] i : a) {
            for (int j : i) {
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }

    static void SumofGreatesColumn() {
        int[] b = new int[3];
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + a[i][j];
            }
            b[j] = sum;
        }
        if (b[0] > b[1] && b[0] > b[2]) {
            System.out.println("Column 1 have greatest sum: " + b[0]);
        } else if (b[1] > b[2] && b[1] > b[0]) {
            System.out.println("Column 2 have greatest sum: " + b[1]);
        } else {
            System.out.println("Column 3 have greatest sum: " + b[2]);
        }
    }

    static void SumofGreatestRow() {
        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + a[i][j];
            }
            b[i] = sum;
        }
        if (b[0] > b[1] && b[0] > b[2]) {
            System.out.println("Row 1 have greatest sum: " + b[0]);
        } else if (b[1] > b[2] && b[1] > b[0]) {
            System.out.println("Row 2 have greatest sum: " + b[1]);
        } else {
            System.out.println("Row 3 have greatest sum: " + b[2]);
        }
    }

    public static void main(String arg[]) {
        sumofrow();
        sumofcolumn();
        sum();
        SumofGreatesColumn();
        SumofGreatestRow();
    }
}


/*
sample input
 {1, 5, 5},
 {7, 9, 8},
 {3, 7, 5}

sample output

The sum of each row
11
24
15
The sum of each Column
11
21
18
The sum of each element
50
Column 2 have greatest sum: 21
Row 2 have greatest sum: 24

 */