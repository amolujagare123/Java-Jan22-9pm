package CollectionDemos.VectorDemos;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        // default initial capacity --> 10
        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); //0

        v.add("Anjali"); // 0
        v.add("Arunna"); // 1
        v.add("Chinamaya"); // 2
        v.add("Deepali"); // 3
        v.add("Harshal"); // 4
        v.add("Harshal"); // 5

        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 6

        v.add("Anjali"); // 0
        v.add("Arunna"); // 1
        v.add("Chinamaya"); // 2
        v.add("Deepali"); // 3

        System.out.println("Capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); // 10

        v.add("Deepali"); // 3

        System.out.println("Capacity="+v.capacity()); // 20
        System.out.println("size="+v.size()); // 11

        System.out.println(v);
    }
}
