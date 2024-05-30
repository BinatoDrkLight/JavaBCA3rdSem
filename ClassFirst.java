package Inheritenceexample;

class PP{
    void show(){
        System.out.println("Show funtction");
    }
}
class P extends PP{
    void display(){
        System.out.println("Display function");
    }
}
public class ClassFirst extends P{
    public static void main(String[] args) {
        ClassFirst classFirst = new ClassFirst();
        classFirst.show();
        classFirst.display();
        //Multiple Inheritence: One child having multiple parent.
        //Multiple Inheritence is not supported by java class.
    }
}
