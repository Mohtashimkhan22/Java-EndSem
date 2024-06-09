import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.print("enter your roll no.: ");
        int RollNo = sc.nextInt();
        System.out.print("enter your course: ");
        String course = sc.nextLine();
        System.out.print("enter your semester: ");
        int sem =sc.nextInt();
        System.out.print("enter your university: ");
        String university = sc.nextLine();
        
        System.out.println("Name: "+name);
        System.out.println("University: "+university);
        System.out.println("RollNo: "+RollNo);
        System.out.println("Course: "+course);
        System.out.println("Semester: "+sem);
        sc.close();
    }
}
