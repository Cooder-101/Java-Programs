public class GCD{
    public static void main(String[] args) {
        int gcd=1,a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        for(int i=1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0)
                gcd=i;
        }
        System.out.printf("GCD of %d and %d is: %d",a,b,gcd);
    }
}