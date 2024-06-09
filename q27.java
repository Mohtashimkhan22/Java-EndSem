import java.util.*;

public class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter n element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int i=0,j=0;
        while (i<n && j<n) {
            while (arr[i]<0 && i<n) {
                i++;
            }
            while (arr[j]>=0 && j<n) {
                j++;
            }
            if (i<n && j<n) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }
        System.out.println("the element of array after rearranging: ");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}