package CollectionsFramework;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String,Integer> map = new TreeMap<>();
        map.put("Vivek",12);
        map.put("Chauhan",123);
        map.put("Pathaan",32);
        System.out.println(map); //Sorting is done based on keys

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        //Navigable Map also do same thing, but it also has some other method
    }

}
