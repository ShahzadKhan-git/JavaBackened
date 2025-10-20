package CollectionsFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ComparatorExample {
    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2; // Ascending order
            // o2 - o2 (Descending order)
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);


        list.sort(new MyComparator());

        //We can use directly by using lambda function
        // list.sort((a,b) -> a-b); For ascending , b-a for descending order

        System.out.println(list);
    }
}
