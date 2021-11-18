import java.util.*;

// To reverse a number 

public class reverse {

    public static void main(String[] args) {
        int num, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String n = sc.nextLine();
        int l = n.length();
        num = Integer.parseInt(n);
        int c = num;
        for (int i = 1; i <= l; i++) {
            int p = c % 10;
            rev = rev * 10 + p;
            c = c / 10;
        }
        System.out.println("The reverse of the number, " + num + " is  " + rev);

    }
}
