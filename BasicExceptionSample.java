import java.text.ParseException;
import java.util.Scanner;

public class ExceptionSample {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        printString(S);
    }

    public static void printString(String s) throws ParseException {
        try{
               System.out.println(Integer.valueOf(s));
        }
        catch(Exception e){
            System.out.print("Bad String");
        }
    }
}
