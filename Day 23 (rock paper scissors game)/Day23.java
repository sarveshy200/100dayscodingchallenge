import java.util.Scanner;
import java.util.Random;


public class Day23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for rock ,Enter 1 for paper,Enter 2 for Scissor");
        //user input
        int userinput= sc.nextInt();
        //computer input
        Random random=new Random();
        //random number between 0 to 2
        int computerinput=random.nextInt();
        //compare user input and computer input
        if (userinput==computerinput){
            //if both are same then draw
            System.out.println("Draw");
        } else if (userinput==0&&computerinput==2||userinput==1&&computerinput==0||userinput==2&&computerinput==1) {
            //if userinput is 0 and computer input is 2 or userinput is 1 and computer input is 0 or userinput is 2 and computer inpute is 1 then user wins
            System.out.println("you win");


        }
        else {
            //if userinput is 0 and computer input is 1 or userinput is 1 and computer input is 2 or userinput is 2 and computer input is 0 then computer wins
            System.out.println("computer win");
        }
    }
}
