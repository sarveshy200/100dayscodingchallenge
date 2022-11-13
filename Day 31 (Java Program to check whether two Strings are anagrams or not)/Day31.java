public class Day31 {
    public static void main(String[] args) {
        //method calling and printing
        System.out.println(isAnagram("aab","baa"));


    }
    private static boolean isAnagram(String string1,String string2){
        int count[]=new int[256];
        //if length of both strings are not equal then they are not anagram
        for (int i=0;i<string1.length();i++){
            //counting the number of characters in string1
            count[string1.charAt(i)]++;
            //counting the number of characters in string2
            count[string2.charAt(i)]--;
        }

        for (int i=0;i<count.length;i++){
            //if the count of any character is not zero then they are not anagram
            if (count[i]!=0){
                //return false
                return false;
            }
        }
        //returning true if all the characters are zero
        return true;
    }
}
