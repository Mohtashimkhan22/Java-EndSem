import java.util.ArrayList;
import java.util.Arrays;

public class q43 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("four", "score", "and", "seven", "years", "ago"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));

        swapPairs(list1);
        swapPairs(list2);

        System.out.println(list1); // Output: [score, four, seven, and, ago, years]
        System.out.println(list2); // Output: [be, to, not, or, be, to, hamlet]
    }

    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            // Swap the elements at index i and i+1
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
}
