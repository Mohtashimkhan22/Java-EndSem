import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter price: ");
        int p=sc.nextInt();
        System.out.print("enter rate: ");
        double r=sc.nextInt();
        System.out.print("enter time: ");
        int n=sc.nextInt();
        System.out.print("enter 1: time deposite\n2: recurring deposite\n");
        int choice=sc.nextInt();
        double amount;
        switch (choice) {
            case 1:
                double temp = 1+ r/100.00;
                double power = Math.pow(temp, n);
                amount = p*power;
                System.out.println(("the deposite amount: "+amount));
                break;
            case 2:
                amount =  (p*n) + p*n*(n+1)/2*(r/100) * (1/12);
                System.out.println("the recurring amount: "+amount);
                break;
            default:
                System.out.println("Invalid choice! enter a valid choice");
                break;
        }
        sc.close();
    }
}
