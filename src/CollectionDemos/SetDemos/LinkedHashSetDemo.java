package CollectionDemos.SetDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet lhs =new LinkedHashSet();

        lhs.add("Anjali");
        lhs.add("Aruna");
        lhs.add("Chinamaya");
        lhs.add("Deepali");
        lhs.add("Harshal");
        System.out.println(lhs.add("Harshal"));
        System.out.println(lhs);


        Iterator itr = lhs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
