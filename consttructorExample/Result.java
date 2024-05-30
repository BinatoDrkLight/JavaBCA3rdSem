package consttructorExample;
import java.util.Scanner;
public class Result {
    private int roll, age;
    private String name, address, faculty;
    private double totalmarks, percentage;

    public Result(){
        this.roll = 0;
        this.age = 0;
        this.name = "Student";
        this.address = "Address";
        this.faculty = "BCA";
        this.totalmarks = 100.0;
        this.percentage = 0.0;
    }

    public Result(int r, int ag){
        this.roll = r;
        this.age = ag;
    }
    public Result(String n, String ad, String fac){
        this.name = n;
        this.address = ad;
        this.faculty = fac;
    }

    public Result(double tm, double perc){
        this.totalmarks = tm;
        this.percentage = perc;
    }
    public int getRoll(){
        return this.roll;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getFaculty(){
        return this.faculty;
    }
    public double getTotalmarks(){
        return this.totalmarks;
    }
    public double getPercentage(){
        return this.percentage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the roll");
        int roll = sc.nextInt();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the name");
        String name = sc1.nextLine();
        System.out.println("Enter the address");
        String address = sc1.nextLine();
        System.out.println("Enter the faculty");
        String faculty = sc1.nextLine();
        System.out.println("Enter the total marks");
        double totalmarks = sc.nextDouble();
        System.out.println("Enter the percentage");
        double percentage = sc.nextDouble();

        Result res1 = new Result();
        Result res2 = new Result(roll, age);
        Result res3 = new Result(name, address, faculty);
        Result res4 = new Result(totalmarks, percentage);

        System.out.println(res1.getRoll());
        System.out.println(res1.getAge());
        System.out.println(res1.getName());
        System.out.println(res1.getAddress());
        System.out.println(res1.getFaculty());
        System.out.println(res1.getTotalmarks());
        System.out.println(res1.getPercentage());

        System.out.println(res2.getRoll());
        System.out.println(res2.getAge());
        System.out.println(res3.getName());
        System.out.println(res3.getAddress());
        System.out.println(res3.getFaculty());
        System.out.println(res4.getTotalmarks());
        System.out.println(res4.getPercentage());

    }
}
