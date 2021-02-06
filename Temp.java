import java.util.*;

public class Timedifference {
    int sec,hr,min;
    public Timedifference(int hr,int min, int sec){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public static Timedifference Dif(Timedifference T1, Timedifference T2){

    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Time Period 1");
        System.out.print("Hour:");
        hr = sr.nextInt();
        System.out.print("Minute:");
        min = sr.nextInt();
        System.out.print("Second:");
        sec = sr.nextInt();
        Timedifference T1 = new Timedifference(hr, min, sec);
        System.out.println("\nTime Period 2");
        System.out.print("Hour:");
        hr = sr.nextInt();
        System.out.print("Minute:");
        min = sr.nextInt();
        System.out.print("Second:");
        sec = sr.nextInt();
        Timedifference T2 = new Timedifference(hr, min, sec);
        Timedifference dif;

        if(T1.sec > T2.sec){
            --T2.min;
            T2.sec += 60;
        }
        dif.sec = T2.sec - T1.sec;
        if(T1.min > T2.min ){
            --T2.hr;
            T2.min += 60;
        }
        dif.min = T2.min - T1.min;
        dif.hr = T2.hr - T1.hr;

        System.out.printf("\nTime Difference: %d:%d:%d - ",T1.hr, T1.min,T1.sec);
        System.out.printf("%d:%d:%d ",T2.hr, T2.min, T2.sec);
        System.out.printf("= %d:%d:%d\n",dif.hr, dif.)
    }
}
