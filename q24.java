import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum1=0,sum2=0;
        for (int i = 1; i < num1; i++) {
            if(num1%i==0)
            {
                sum1+=i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if(num2%i==0)
            {
                sum2+=i;
            }
        }
        if(sum1/num1 == sum2/num2)
        {
            System.out.println("Abundant Number");
        }
        else
        {
            System.out.println("Not Abundant Number");
        }
        sc.close();
    }
}
