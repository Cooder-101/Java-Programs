import java.util.*;
public class bank {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        float a,r;
        int p,n;
        System.out.println("1.Term Deposit");
        System.out.println("2.Recurring Deposit");
        System.out.println("Enter your choice: ");
        int ch;
        ch = sr.nextInt();
        switch(ch){
            case 1:{
                System.out.println("Enter Principal: ");
                p = sr.nextInt();
                System.out.println("Enter rate of interest: ");
                r = sr.nextFloat();
                System.out.println("Enter time period in years: ");
                n = sr.nextInt();
                a = p*(1 + r/100)*n;
                System.out.println("Maturity Amount: "+a);
            } 
            break;
            case 2:{
                System.out.println("Enter monthly installment: ");
                p = sr.nextInt();
                System.out.println("Enter rate of interest: ");
                r = sr.nextFloat();
                System.out.println("Enter time period in months: ");
                n = sr.nextInt();
                a = p*n + p*n*(n+1)/2*r/100*(1/12);
                System.out.println("Maturity Amount: "+a);
            } 
            break;
            default:
                System.out.println("Invalid Choice");
        }
        sr.close();
    }
}
