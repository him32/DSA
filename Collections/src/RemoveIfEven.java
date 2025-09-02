import java.util.ArrayList;
import java.util.List;

public class RemoveIfEven {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr.removeIf(x->x%2==0);
        System.out.println(arr);

    }
}
