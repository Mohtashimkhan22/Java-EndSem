import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q44 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10, 11, 12));

        List<Integer> result = alternate(list1, list2);
        System.out.println(result); // Output: [1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12]
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(list1.get(i));
            }
            if (i < size2) {
                result.add(list2.get(i));
            }
        }

        return result;
    }
}
