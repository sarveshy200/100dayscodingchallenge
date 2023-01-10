// Using Brute Force
public class MaxSubArraysSum {
    public static void MaxSubArray(int[] number){
        //initializing the variables
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for (int i=0;i<number.length;i++){
            int starts=i;
            for (int j=0;j<number.length;j++){
                int end=j;
                CurrSum=0;
                for (int k=starts;k<=end;k++){
                    CurrSum +=number[k];
                }
                System.out.println(CurrSum);
                if (MaxSum<CurrSum){
                    MaxSum=CurrSum;
                }
            }

        }
        System.out.println("Max SubArrays " + MaxSum);
    }
    public static void main(String[] args) {
        int[] number ={1,-2,6,-1,3};

        MaxSubArray(number);
    }
}
