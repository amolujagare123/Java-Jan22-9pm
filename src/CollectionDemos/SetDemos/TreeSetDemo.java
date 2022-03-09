package CollectionDemos.SetDemos;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts =new TreeSet();

        ts.add("Anjali");
        ts.add("Aruna");
        ts.add("Chinamaya");
        ts.add("Deepali");
        ts.add("Harshal");
        System.out.println(ts.add("Harshal"));
        System.out.println(ts);


        Iterator itr = ts.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
