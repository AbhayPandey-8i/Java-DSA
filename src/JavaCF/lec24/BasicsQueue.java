package JavaCF.lec24;

import java.util.LinkedList;
import java.util.Queue;

public class BasicsQueue {
   public static void main(String[] args) {
       Queue<Integer> q = new LinkedList<>();

       //add elements
       q.offer(10);
       q.offer(20);
       q.offer(30);

       System.out.println(q);

       //removes front element
       q.poll();
       System.out.println(q);

       //Peeking front element of queue
       System.out.println(q.peek());
    }

}
