import java.util.*;
public class friendlypairs {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num1,num2,sum1=0,sum2=0;
        System.out.println("Enter the First Number: ");
        num1 = sr.nextInt();
        System.out.println("Enter the Second Number:");
        num2 = sr.nextInt();
        for(int i=1; i<num1; i++)
            if(num1%i == 0)
                sum1+=i;
        for(int i=1;i<num2;i++)
            if(num2%i==0)
                sum2+=i;
        if(num1 == sum1 && num2 == sum2)
            System.out.println("Abundant Numbers");
        else
            System.out.println("Not Abundant Numbers");
        sr.close();
    }
}
