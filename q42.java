import java.util.*;
public class q42 {
    void removeEvenLength(ArrayList<String> arr)
    {
        ArrayList<String> str=new ArrayList<>();
        for (String string : arr) {
            if(string.length()%2!=0)
            {
                str.add(string);
            }
        }
        for (String string : str) {
            System.out.print(string+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        q42 obj = new q42();
        arr.add("rakeeb");
        arr.add("khan");
        arr.add("mohtashim");
        arr.add("ritu");
        arr.add("raj");
        arr.add("singh");
        for (String string : arr) {
            System.out.print(string+ " ");
        }
        System.out.println();
        obj.removeEvenLength(arr);
    }
}
