package CollectionDemos.QueueDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(32);
        pq.offer(11);
        pq.offer(42);
        pq.offer(17);
        pq.offer(82);

        // 11,12,17,32,42,82

        // some os or complers doesnot support the priority queue
        // so the output might not be sorted
        System.out.println(pq);

        System.out.println(pq.poll());//11
        System.out.println(pq.poll());//12
        System.out.println(pq.poll());//17
        System.out.println(pq.poll());//32
        System.out.println(pq.poll());//42
        System.out.println(pq.poll());//82



    }
}
