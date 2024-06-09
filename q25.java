import java.util.Scanner;

class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a numbers: ");
        int num=sc.nextInt();
        int newnum=0;
        while (num!=0) {
            int digit = num%10;
            if(digit==0){
                newnum=newnum*10+1;
            }
            else{
                newnum=newnum*10+digit;
            }
            num=num/10;
        }
        while (newnum!=0) {
            int digit = newnum%10;
            num=num*10+digit;
            newnum=newnum/10;
        }
        System.out.println("the new number after repplacement: "+num);
        sc.close();
    }
}
