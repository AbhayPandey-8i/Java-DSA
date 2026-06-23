package JavaCF.lec24;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrDeque {
   public static void main(String[] args) {
       Deque<Integer> q = new ArrayDeque<>();
       q.offer(10);
       q.addFirst(20);
       q.addLast(40);
       System.out.println(q);

       q.pollLast();
       System.out.println(q);
       q.pollFirst();
       System.out.println(q);
    }
}
