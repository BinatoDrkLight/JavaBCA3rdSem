package Inheritenceexample;
//Interface: Collection of virtual function.
interface A{
    void print(); //Virtual Function
}

interface B{
    void printDisplay(); //Virtual Function.
}
public class MultipleInheritence implements A,B{
    @Override
    public void print() {
        System.out.println("PrintDisplayFunction");
    }

    @Override
    public void printDisplay() {
        System.out.println("PrintFunction");
    }

    public static void main(String[] args) {
        MultipleInheritence multipleInheritence = new MultipleInheritence();
        multipleInheritence.print();
        multipleInheritence.printDisplay();
    }
}

/*
    MVC
 */