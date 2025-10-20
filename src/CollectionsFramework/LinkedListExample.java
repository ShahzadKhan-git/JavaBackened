package CollectionsFramework;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.addFirst(1); // O(1)
        list.addLast(3); // O(1)
        //Java has built-in Doubly Linked List

        System.out.println(list);

        list.get(2); // O(n)
        list.removeIf(x -> x%2==0);
        System.out.println(list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);


    }
}
