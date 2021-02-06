import java.util.*;

public class Timedifference{
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int hr1,hr2,dif_hr=0;
        int min1,min2,dif_min=0;
        int sec1,sec2,dif_sec=0;
        System.out.println("Time Period 1");
        System.out.print("Hour:");
        hr1 = sr.nextInt();
        System.out.print("Minute:");
        min1 = sr.nextInt();
        System.out.print("Second:");
        sec1 = sr.nextInt();
        System.out.println("\nTime Period 2");
        System.out.print("Hour:");
        hr2 = sr.nextInt();
        System.out.print("Minute:");
        min2 = sr.nextInt();
        System.out.print("Second:");
        sec2 = sr.nextInt();

        System.out.printf("\nTime Difference: %d:%d:%d - ",hr1, min1,sec1);
        System.out.printf("%d:%d:%d ",hr2, min2, sec2);
        if(sec1 > sec2){
            --min2;
            sec2 += 60;
        }
        dif_sec = sec2 - sec1;
        if(min1 > min2 ){
            --hr2;
            min2 += 60;
        }
        dif_min = min2 - min1;
        dif_hr = hr2 - hr1;
        System.out.printf("= %d:%d:%d\n",dif_hr, dif_min,dif_sec);
        sr.close();
    }
}