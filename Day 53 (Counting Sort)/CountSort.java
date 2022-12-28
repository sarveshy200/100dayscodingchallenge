public class CountSort {
    public static void CountSort(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int[] count=new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0;i<count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,3,4,1,6,4,3};
        CountSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
