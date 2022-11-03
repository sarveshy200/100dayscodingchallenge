public class Day21 {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0,1,0,1,10};
        int j=0;

        //[0,1,0,1,0,0,1] array length=7
        // Traverse an array
        for (int i=0;i< arr.length;i++){

            //if value at index is equal to 0
            if (arr[i]==0){
                arr[j++]=arr[i];//[0,0,0,0]
            }
        }
        //we have already moved zero,Now the remaining values is 1
        while (j< arr.length){
            arr[j++]=1;//[0,0,0,0,1,1,1,1]
        }
        for (int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
