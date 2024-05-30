package nullException;

public class NullException {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
        } catch (Exception e){
            System.out.println(e.getClass() + e.getMessage());
        }

        System.out.println("Red Panda");
    }
}
