package Collections;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.addFirst("Start");
        list.addLast("End");
        list.remove("B");

        System.out.println(list);


    }
}
