public class MaxIndexDiff {

    public static void main(String[] args) {
        int arr[]={34,8,10,3,2,80,30,33,1};
        int j=arr.length-1;
        int i=0;
        while(i<j)
        {
            if(arr[i]<arr[j])
            {
                break;
            }
            else
            {
                i++;
                j--;
            }
        }
        System.out.println(j-i);
    }
}