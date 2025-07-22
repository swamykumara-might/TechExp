package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TechQueue {
    public static void main(String args[]){
//        Queue<Integer> que = new LinkedList<>();
//
//        que.add(10);
//        que.add(20);
//        que.add(30);
//        que.add(40);
//        que.add(50);
//        System.out.println("Queue"+ que);
//
//        System.out.println(que.remove());
//        System.out.println(que.peek());
//        System.out.println(que.size());
        System.out.println("Priority Queue");

        Queue<Integer> que1 = new PriorityQueue<>();

        que1.add(10);
        que1.add(20);
        que1.add(30);
        que1.add(15);
        que1.add(5);
        System.out.println("Queue"+ que1);

        System.out.println(que1.remove());
        System.out.println(que1.peek());
        System.out.println(que1.size());
    }
}
