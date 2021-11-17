import java.util.*;
// To check whether a given number or string is a palindrome or not
// a palindrome number is one whose last digit and first digits are same. eg 363 is a palindrome. 

public class palindrome {
    public static void main(String args[]) {
        String num, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        num = sc.nextLine();
        int length = num.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + num.charAt(i);
        if (num.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }

}
