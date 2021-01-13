package lab1;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num,first,last;
        System.out.println("Enter a number: ");
        num = sr.nextInt();
        last = num%10;
        num/=10;
        first = num/10;
        System.out.println("First digit is: "+first);
        System.out.println("Last digit is: "+last);
        sr.close();
    }
}
