//he code is a simple program that prints the decimal equivalent of an integer.
//the code starts by declaring variables for the number to be converted and its power.
//It then goes into a loop where it will print out the last digit of binNum, which is 10, and then add up decNum using pow(2) until binNum becomes 0.
//The code attempts to calculate the decimal equivalent of a binary number.
//The first line of code declares a variable myNum, which will be used to store the value of the input binary number.
//The next three lines declare variables pow, lastDigit and decNum.
//The variable lastDigit stores the digit that was just calculated in the loop (10).
//The variable decNum stores the decimal equivalent of that digit (the sum of 2 times pow multiplied by lastDigit).
//Finally, pow is declared as an integer variable with a value 0.


public class binarytodecimal {
    public static void main(String[] args) {
        bintoDec(111);
    }
    public static void bintoDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;

        while (binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int) Math.pow(2,pow));

            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+ myNum + "=" +decNum);

    }
}

/*
input
101
output
5
input
111
output
7
 */

//test case1
/*
Number Should be Binary 0 or 1
 */

//test case 2
/*
number should be positive
 */