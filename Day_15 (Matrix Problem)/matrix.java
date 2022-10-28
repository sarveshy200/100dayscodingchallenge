

public class matrix {
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


