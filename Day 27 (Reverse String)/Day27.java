public class Day27 {
    public void reverseString(char[] s) {
        int n = s.length;
        //update reverse va;ue in rev
        for (int i = 0; i < n / 2; i++) {
            //swap
            s[i] = (char) (s[i] + s[n - i - 1]);
            //update
            s[n - i - 1] = (char) (s[i] - s[n - i - 1]);
            //update
            s[i] = (char) (s[i] - s[n - i - 1]);
        }

    }
}

