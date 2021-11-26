import java.util.*;

public class ReverseString {

    // reverse string method
    static String reversestr(String s) {
        String r = "";
        for (int i = s.length(); i > 0; --i) {
            r = r + (s.charAt(i - 1));
        }
        return r;
    }

    public static void main(String[] arg) {
        ReverseString rs = new ReverseString(); // object created
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reverse of a String  is : " + rs.reversestr(str)); // method call rs.reversestr
    }
}