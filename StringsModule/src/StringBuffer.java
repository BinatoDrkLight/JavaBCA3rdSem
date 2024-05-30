import java.util.Scanner;

class StringBuffer{
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter First name:");
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        System.out.println("Middle name:");
        String m = sc.nextLine();
        System.out.println("Enter Last name:");
        String l = sc.nextLine();

        String fullName = f + m + l;

        for(int i=0; i<fullName.length(); i++){
            if(fullName.charAt(i) == 'a' | fullName.charAt(i) == 'e' | fullName.charAt(i) == 'i' | fullName.charAt(i) == 'o' | fullName.charAt(i) == 'u'){
                count++;
            }}

        System.out.println(count);
        System.out.println(f.charAt(0) + "." + m.charAt(0) + " " + l);
        System.out.println(l.charAt(l.length()-1) + fullName + " " + l + l.charAt(l.length()-1));
    }
}