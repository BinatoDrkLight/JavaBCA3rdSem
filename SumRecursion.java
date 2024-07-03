//Using recursion to count the total sum of Nth numbers.
import java.util.Scanner;
public class SumRecursion {
    //3 arguments n(sum upto nth number), count(represents each number which gets incremented),
    //sum(variable to store sum).
    public static void sumRecursion(int n, int count, int sum){
        //check if added till the nth term
        if(count >= n){
            sum = sum + count;
            System.out.println(sum);
            return;
        }
        sum = sum + count;
        //Calling recursively
        sumRecursion(n, count+1, sum);
    }
    public static void main(String[] args){
        System.out.println("Sum of numbers to be calculated upto:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumRecursion(n, 0, 0);
    }
}
