import java.util.*;
public class FamilyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players");
        int n = sc.nextInt();

        //String s=sc.nextLine();

        char[] ch = {'x', 'y', 'x'};

        boolean[] ar = new boolean[n];

        int i = 0;
        while (i < n) {
            ar[i] = true;
            i++;
        }
        int j = 0;

        while (n != 1) {
            for (i = 0; i < ar.length; i++) {
                if (ar[i]) {
                    if (ch[j] == 'y') {
                        ar[i] = false;
                        n--;
                        j++;
                    } else {
                        j++;
                    }
                }
                //i++;
                if (i >= ar.length) {
                    i = 0;
                }
                if (j >= ch.length) {
                    j = 0;
                }
            }
        }
        for (int k = 0; k < ar.length; k++) {
            if (ar[k] == true) {
                System.out.println("Winer.index: " + (k + 1));
                break;
            }
        }
    }
}
