public class MergerSort {
    public static void main(String[] args) {
        //take a array
        int[] arr = { 5, 4, 3, 2, 1 };
        //call the mergeSort method
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        //check if left is less than right
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);
            mergeSort(arr, mid + 1, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        //initialize i, j, and k
        int i = left;
        int j = mid + 1;
        int t = 0;
        //traverse both arrays and in each iteration add smaller of both elements in temp
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t++;
                i++;
            } else {
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        while (i <= mid) {
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            t++;
            j++;
        }
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
