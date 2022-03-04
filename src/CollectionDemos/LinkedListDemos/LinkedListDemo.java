package CollectionDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Anjali"); // 0
        ll.add("Aruna"); // 1
        ll.add("Chinamaya"); // 2
        ll.add("Deepali"); // 3
        ll.add("Harshal"); // 4
        ll.add("Harshal"); // 5

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
