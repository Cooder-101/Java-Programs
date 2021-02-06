import java.util.*;

public class Octal_to_decimal{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int deci=0, oct=0,i=0,temp,ch;
        do{
            System.out.println("\n1. Octal to Decimal number");
            System.out.println("2. Decimal to Octal number");
            System.out.println("3. Exit");
            ch = sr.nextInt();
            switch(ch){
                case 1: {
                    System.out.print("Enter a Octal number: ");
                    oct = sr.nextInt();
                    temp = oct;
                    long rem;
                    while(temp!=0){
                        rem = temp%10;
                        temp/=10;
                        deci += rem * Math.pow(8,i);
                        ++i;
                    }
                    System.out.printf("%d in Octal = %d in decimal\n",oct,deci);
                }
                break;
                case 2:{
                    System.out.print("Enter a Decimal number: ");
                    deci = sr.nextInt();
                    temp = deci;
                    i=1;
                    int rem;
                    while(temp!=0){
                        rem = temp%8;
                        temp/=8;
                        oct += rem*i;
                        i*=10;
                    }
                    System.out.printf("%d in decimal = %d in Octal\n",deci,oct);
                }
            }
        }while(ch<3);
        sr.close();
    }
}