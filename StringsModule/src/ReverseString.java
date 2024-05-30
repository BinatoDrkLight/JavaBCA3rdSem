import java.util.Scanner;
import java.lang.StringBuffer;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name =sc.nextLine();
        if(name.length() < 2){
            System.out.println("Less number of character");;
        } else {
        System.out.println(name + name + name);
         }
        StringBuffer stringBuffer = new StringBuffer(name);
        //Program to reverse a String
        System.out.println(stringBuffer.reverse());
    }
}
