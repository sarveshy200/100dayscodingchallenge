public class Day22 {
    public static void main(String[] args) {
        int arr[] = {9, 4, 5, 5, 9, 6, 7, 8, 9, 10};
        int smallest = arr[0];
        int secondsmallest = arr[0];
        //For length of an array
        for (int i = 0; i < arr.length; i++) {
            //if value at index is less than smallest
            if (arr[i] < smallest) {
                //assign value at index to secondsmallest
                secondsmallest = smallest;
                //assign value at index to smallest
                smallest = arr[i];
                //if value at index is less than secondsmallest and greater than smallest
            } else if (arr[i] < secondsmallest) {
                //assign value at index to secondsmallest
                secondsmallest = arr[i];
            }
        }
        //print smallest
        System.out.println("Smallest number is: "+smallest);
        //print secondsmallesr
        System.out.println("Second smallest number is:"+secondsmallest);
    }
}

