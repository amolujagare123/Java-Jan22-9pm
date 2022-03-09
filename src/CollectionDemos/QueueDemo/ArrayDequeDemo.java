package CollectionDemos.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("pallavi");
        adq.offer("Anjali");
        adq.offer("shobith");
        adq.offer("Deepali");
        adq.offer("Manoj");

        System.out.println(adq);

        adq.offerFirst("First");
        adq.offerLast("Last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }
}
