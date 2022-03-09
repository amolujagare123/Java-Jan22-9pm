package CollectionDemos.SetDemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

    public static void main(String[] args) {

        HashSet hs =new HashSet();

        hs.add("Anjali");
        hs.add("Aruna");
        hs.add("Chinamaya");
        hs.add("Deepali");
        hs.add("Harshal");
        System.out.println(hs.add("Harshal"));

        System.out.println(hs);


        Iterator itr = hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}
