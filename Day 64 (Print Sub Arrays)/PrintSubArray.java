public class PrintSubArray {
    public static void SubArray(int number[]){
        int ts=0;
        for (int i=0;i<number.length;i++){
            int starts=i;
            for (int j=0;j<number.length;j++){
                int end=j;
                for (int k=starts;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number of SubArrays Is: " + ts);
    }
    public static void main(String[] args) {
        int number []={2,4,6,8,10};
        
        SubArray(number);
    }
}
