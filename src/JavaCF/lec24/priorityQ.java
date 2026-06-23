package JavaCF.lec24;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQ {
  public static void main(String[] args) {

      //NOTE: Less integer value = High priority,Its called minHeap;

      Queue<Integer> pq = new PriorityQueue<>();
      pq.offer(10); //holds highest priority
      pq.offer(20);
      pq.offer(30);

      System.out.println(pq);
      System.out.println(pq.poll());
      System.out.println(pq);
    }
}
