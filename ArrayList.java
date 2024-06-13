import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args){
    java.util.ArrayList<String> list = new java.util.ArrayList<>(); //Creating ArrayList
    list.add("Ravi"); //Adding object in arraylist
    list.add("Vijay");
    list.add("Ravi");
    list.add("Ajay");

    //Traversing list through iterator
    Iterator<String> itr = list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}
