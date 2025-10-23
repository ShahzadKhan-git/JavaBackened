package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFramework {
    public static void main(String[] args) {

        //Different ways of declaring ArrayList
        ArrayList <Integer> arr = new ArrayList<>();
        //Initial Capacity of ArrayList is 10
        //Capacity Increases by 1.5x


        List<String> list = new ArrayList<>();


        List<String> list1 = Arrays.asList("Monday" , "Tuesday");
        // In .asList method we can't add or remove the element , we can only replace it

        String[] arr1 = {"apple", "Mango"};
        List<String> list2 = Arrays.asList(arr1);

        List<Integer> list3 = List.of(1,2,3);
        // In .of method we can't do anything

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Banana");
        //We can use this to add in the .asList

        List<Integer> arr3 = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.addAll(list3); //Add the collection directly
        System.out.println(arr3);

        Integer[] arr2 = list3.toArray(new Integer[0]);  //To convert ArrayList ot Array






    }
}
