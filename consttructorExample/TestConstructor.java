package consttructorExample;
public class TestConstructor{
    int roll;
    String name, email;
    public TestConstructor(){
            System.out.println("Hello I'm me");
    }
    public TestConstructor(int r, String n){
        this.roll = r;
        this.name = n;
        System.out.println(this.roll);
        System.out.println(this.name);
    }
    public TestConstructor(String em){
        this.email = em;
        System.out.println(this.email);
    }
    public static void main(String[] args) {
        TestConstructor testconstructor = new TestConstructor();
        TestConstructor testconstructor1 = new TestConstructor(10, "BCA");
        TestConstructor testconstructor2 = new TestConstructor("Hello");
    }

}
