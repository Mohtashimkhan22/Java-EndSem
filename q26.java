import java.util.*;
public class q26 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element of array: ");
        int n=sc.nextInt();
        System.out.println("enter n element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(flag){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else{
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag=!flag;
        }
        System.out.println("the element of array in zig zag order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
