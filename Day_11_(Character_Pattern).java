//The code is a program that prints out the character four times.
//The outer loop is for the line, which starts at 1 and goes up to 4.
//The inner loop is for chars, which start at 1 and goes up to the line.
//In each iteration of the inner loop, it prints out the character A on System. out followed by an incrementing number in ch++ statements until it reaches 4 in ch++ statements again.
//The code prints the character on each of the four lines.

public class CharacterPrint {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        //outer loop for line
        for (int line=1;line<=n;line++){
            //inner loop print character
            for (int chars=1; chars<=line;chars++){
                //print character
                System.out.print(ch);
                //increase the character
                ch++;
            }
            //print next line
            System.out.println();
        }
    }
}

//Output:
//A
//BC
//DEF
//GHIJ
//KLMNO

//Test Case 1:
//The programme prints some numeric or symbols value after the z character.
//A
//BC
//DEF
//GHIJ
//KLMNO
//PQRSTU
//VWXYZ[\

