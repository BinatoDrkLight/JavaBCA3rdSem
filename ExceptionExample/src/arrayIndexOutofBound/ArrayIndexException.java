package arrayIndexOutofBound;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] Arr = new int[]{1, 2, 3, 4, 5};
        try {
            System.out.println(Arr[10]);
        } catch (Exception e) {
            System.out.println(e.getClass() + e.getMessage());
        }
    }
}
// propagation