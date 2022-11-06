
import java.util.Arrays;
class Day24 {

    public static int[] removeTheElement(int[] arr, int index)
    {
        // if the array is empty
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
        // Copy the elements except the index
        for (int i = 0, k = 0; i < arr.length; i++) {
           // if the index is
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args)
    {

        // get the array
        int[] arr = { 1, 2, 3, 4, 5 };

        // print the arrau
        System.out.println("Original Array: "
                + Arrays.toString(arr));

        int index = 2;

       // print the index
        System.out.println("Index to be removed: " + index);
        // Remove the element
        arr = removeTheElement(arr, index);
        // print the new array
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}
