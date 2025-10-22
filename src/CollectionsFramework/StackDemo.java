package CollectionsFramework;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        Integer removedElement = st.pop();
        System.out.println(st);
        Integer peek = st.peek();
        System.out.println(peek);
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        int search = st.search(3); //Search sirf index batata h aur 1 based index hota h
        System.out.println(search);


        //LinkedList as Stack due to doublyLinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.getLast(); //Peek
        list.removeLast(); //Pop



    }
}
