import java.util.*;
public class Displaydetails {
    public static void main(String[] args) {
        String name, course;
        int uniroll, sem;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sr.next();
        System.out.println("Enter Course: ");
        course = sr.next();
        System.out.println("Enter University roll no.: ");
        uniroll= sr.nextInt();
        System.out.println("Enter Semester: ");
        sem = sr.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("University roll no.: "+uniroll);
        System.out.println("Semester: "+sem);
        sr.close();
    }
}
