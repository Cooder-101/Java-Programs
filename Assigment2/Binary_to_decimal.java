import java.util.*;
public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int deci=0, bi=0,i=0,temp,ch;
        do{
            System.out.println("\n1. Binary to Decimal number");
            System.out.println("2. Decimal to Binary number");
            System.out.println("3. Exit");
            ch = sr.nextInt();
            switch(ch){
                case 1: {
                    System.out.print("Enter a Binary number: ");
                    bi = sr.nextInt();
                    temp = bi;
                    long rem;
                    while(temp!=0){
                        rem = temp%10;
                        temp/=10;
                        deci += rem * Math.pow(2,i);
                        ++i;
                    }
                    System.out.printf("%d in binary = %d in decimal\n",bi,deci);
                }
                break;
                case 2:{
                    System.out.print("Enter a Decimal number: ");
                    deci = sr.nextInt();
                    temp = deci;
                    i=1;
                    int rem;
                    while(temp!=0){
                        rem = temp%2;
                        temp/=2;
                        bi += rem*i;
                        i*=10;
                    }
                    System.out.printf("%d in decimal = %d in Binary\n",deci,bi);
                }
            }
        }while(ch<3);
        sr.close();
    }
}
