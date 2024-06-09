import java.util.Arrays;

public class q33 {

    // Method to find all pairs of elements in an array whose sum is equal to a given number
    public void arrayFunc(int[] array, int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(array[i] + " + " + array[j] + " = " + target);
                }
            }
        }
    }

    // Method to merge two sorted arrays maintaining the sorted order
    public void arrayFunc(int[] A, int p, int[] B, int q) {
        int[] merged = new int[p + q];
        System.arraycopy(A, 0, merged, 0, p);
        System.arraycopy(B, 0, merged, p, q);
        
        Arrays.sort(merged);
        
        System.arraycopy(merged, 0, A, 0, p);
        System.arraycopy(merged, p, B, 0, q);
        
        System.out.println("Array A after merging: " + Arrays.toString(A));
        System.out.println("Array B after merging: " + Arrays.toString(B));
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        q33 demo = new q33();
        
        // Test the first overloaded method
        int[] array = {4, 6, 5, -10, 8, 5, 20};
        int target = 10;
        demo.arrayFunc(array, target);
        
        // Test the second overloaded method
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8, 10};
        demo.arrayFunc(A, A.length, B, B.length);
    }
}
