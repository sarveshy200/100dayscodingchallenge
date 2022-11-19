public class StringPerformance {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        //for loop for string concatenation
        for (int i = 0; i < 100000; i++) {
            String str1 = "India";
            String str2 = "India";
        }
        //using long for calculating time
        long endTime = System.currentTimeMillis();
        //print the time taken for string concatenation
        System.out.println("Time taken by String: " + (endTime - startTime) + "ms");
        //for loop for string builder
        long startTime1 = System.currentTimeMillis();
        //for loop for string builder
        for (int i = 0; i < 100000; i++) {
            //using string builder
            String str1 = new String("India");
            //using string builder
            String str2 = new String("India");
        }
        //using long for calculating time
        long endTime1 = System.currentTimeMillis();
        //print the time taken for string builder
        System.out.println("Time taken by new String: " + (endTime1 - startTime1) + "ms");
    }
}
