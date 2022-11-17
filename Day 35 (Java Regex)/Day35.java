import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Day35{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //while for multiple test cases
        while(in.hasNext()){
            //taking input
            String IP = in.next();
            //splitting the input by "."
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    String num="(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";
    String pattern=num+"."+num+"."+num+"."+num;
}