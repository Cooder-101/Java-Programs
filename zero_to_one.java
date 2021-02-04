import java.util.*;
public class zero_to_one {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int num,result=0,temp,count=1;
        System.out.println("Enter a number:");
        num = sr.nextInt();
        while(num>0){
            temp = num%10;
            if(temp == 0){
                result = result + count*1;
            }
            else
                result = result  + temp*count;
            count*=10;
            num/=10;
        }
        System.out.println("The after number replacement: "+result);
        sr.close();
    }
}
