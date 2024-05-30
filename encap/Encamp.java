package encap;
import java.util.Scanner;
public class Encamp {
    void add(EncapValue ee){
        int result;
        result = ee.getNum1() + ee.getNum2();
        System.out.println("Addition = "+result);
    }
    void subtract(EncapValue ee){
        int result;
        result = ee.getNum1() - ee.getNum2();
        System.out.println("Subtraction = "+result);
    }


    public static void main(String[] args) {
        int num1, num2;
        Encamp addAndSubtract = new Encamp();
        Scanner scanner = new Scanner(System.in);
        EncapValue encapvalue = new EncapValue();
        System.out.println("Enter num1");
        num1 = scanner.nextInt();
        System.out.println("Enter num2");
        num2 = scanner.nextInt();
         encapvalue.setNum1(num1);
         encapvalue.setNum2(num2);
//        int result;
//        result = encapvalue.getNum1() + encapvalue.getNum2();
//           System.out.println(result);
        addAndSubtract.add(encapvalue);
        addAndSubtract.subtract(encapvalue);

    }
}
