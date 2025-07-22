package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDequeue {
public static void main(String args[]){
    Deque<Integer> dq = new ArrayDeque<>();

    dq.addFirst(10);
    dq.addLast(15);

    System.out.println("DQ Ele"+dq);

    int f = dq.removeFirst();
    int l = dq.removeLast();
    System.out.println("First Ele "+ f +" Last Ele "+l);
    System.out.println("Deleted DQ Ele"+dq);
}
}
