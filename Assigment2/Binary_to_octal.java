import java.util.*;

public class Binary_to_octal {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int oct=0,deci=0, bi=0,i=0,temp,ch;
        do{
            System.out.println("\n1. Binary to Octal number");
            System.out.println("2. Octal to Binary number");
            System.out.println("3. Exit");
            ch = sr.nextInt();
            switch(ch){
                case 1: {
                    System.out.println("Enter a Binary number: ");
                    bi = sr.nextInt();
                    temp = bi;
                    long rem;
                    while(temp!=0){
                        deci += (temp%10) * Math.pow(2,i);
                        i++;
                        temp /= 10;
                    }
                    i=1;
                    while(deci !=0){
                        oct += (deci % 8)*i;
                        deci /= 8;
                        i *= 10;
                    }
                    System.out.printf("%d in binary = %d in Octal\n",bi,oct);
                }
                break;
                case 2:{
                    System.out.println("Enter a Octal number: ");
                    oct = sr.nextInt();
                    temp = oct;
                    int rem;
                    while(temp!=0){
                        deci += (temp % 10) * Math.pow(8, i);
                        i++;
                        temp /=10;
                    }
                    i=1;
                    while(deci !=0){
                        bi += (deci %2) *i;
                        deci /= 2;
                        i *= 10;
                    }
                    System.out.printf("%d in Octal = %d in Binary\n",oct,bi);
                }
            }
        }while(ch<3);
        sr.close();
    }
}
