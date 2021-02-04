public class Armstrong {
    public static void main(String[] args) {
        int gcd=1,a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        for(int i=a+1; i<b;i++){
            int d=0,res=0,n=i;
            while(n!=0){
                n/=10;
                d++;
            }
            n=i;
            while(n!=0){
                int rem = n%10;
                res += Math.pow(rem,d);
                n/=10;
            }
            if(res == i)
                System.out.print(i + " ");
        }
    }
}
