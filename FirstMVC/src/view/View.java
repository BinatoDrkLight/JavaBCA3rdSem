package view;
import java.util.Scanner;
import encap.StdEncap;
import interf.StdInterf;
import impl.StdImpl;
public class View {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        StdEncap stdEncap = new StdEncap();
        stdEncap.setNum1(num1);
        stdEncap.setNum2(num2);

     //The process of combining Object is known as dependency injection.
     StdInterf ss = new StdImpl();
     ss.add(stdEncap);
     ss.subtract(stdEncap);
    }
}
