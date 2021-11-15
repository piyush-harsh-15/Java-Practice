import java.util.*;
//To  check whether a given number is armstrong or not.
//an armstrong number is the sum of the cube of its digits.

public class armstrong {
    // function to check if the number is Armstrong or not
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;

        // assigning n into a temp variable
        temp = n;

        // To count the number of digits in the given number
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = n;
        while (temp > 0) {
            // determines the last digit from the number
            last = temp % 10;
            // calculates the power of a number up to digit times and add the resultant to
            // the sum variable
            sum += (Math.pow(last, digits));
            // removes the last digit
            temp = temp / 10;
        }
        // compares the sum with n
        if (n == sum)
            // returns if sum and n are equal
            return true;
        // returns false if sum and n are not equal
        else
            return false;
    }

    // main function
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        // reads the limit from the user
        num = sc.nextInt();

        if (isArmstrong(num))
            System.out.print(num + " is an Armstrong number");
        else
            System.out.print(num + " is not an Armstrong number");
    }
}