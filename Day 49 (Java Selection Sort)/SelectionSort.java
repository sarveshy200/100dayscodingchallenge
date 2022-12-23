public class SelectionSort {
    public static void main(String[] args) {
        //array of 5 numbers
        int[] arr = {5, 4, 3, 2, 1};
        int n = arr.length;
        //for loop to iterate over the array
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
