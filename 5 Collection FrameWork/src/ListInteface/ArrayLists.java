package ListInteface;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    static void main() {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        for(Integer ele : arr){
            System.out.println(ele+" ");
        }
    }
}
