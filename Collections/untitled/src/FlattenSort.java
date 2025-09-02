import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlattenSort {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
        arr.add(new ArrayList<Integer>(Arrays.asList(6,7,8,90,10)));
        arr.add(new ArrayList<Integer>(Arrays.asList(11,12,13,14,15)));
        arr.add(new ArrayList<Integer>(Arrays.asList(16,17,18,19,20)));

        System.out.println(arr);
        List<Integer> total = new ArrayList<>();
        for (List<Integer> a : arr) {
            total.addAll(a);
        }
        sort(total);
        System.out.println(total);
    }

    public static void sort(List<Integer> arr) {
        Collections.sort(arr);
    }
}
