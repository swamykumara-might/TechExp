package Collections;

import java.util.Vector;

public class TestVector {

        public static void main(String args[]) {
            Vector<String> list = new Vector<>();
            list.add("A");
            list.add("B");
            list.addFirst("Start");
            list.addLast("End");
            list.remove("B");

            System.out.println(list);


        }

}
