public class RadixSort {
public static void RadixSort(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int exp=1;max/exp>0;exp*=10){
            CountSort(arr,exp);
        }
    }
    public static void CountSort(int[] arr,int exp){
        int[] output=new int[arr.length];
        int[] count=new int[10];
        for (int i=0;i<arr.length;i++){
            count[(arr[i]/exp)%10]++;
        }
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for (int i=arr.length-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={170,45,75,90,802,24,2,66};
        RadixSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
