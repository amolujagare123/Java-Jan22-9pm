package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al  = new ArrayList();

        al.add("Anjali"); // 0
        al.add("Arunna"); // 1
        al.add("Chinamaya"); // 2
        al.add("Deepali"); // 3
        al.add("Harshal"); // 4
        al.add("Harshal"); // 5
        al.add(12); // 6 ( Integer )
        al.add(1.2); // 7
        al.add('g'); // 8
        al.add(true); // 9

       // System.out.println(al);
       //System.out.println("Size="+al.size());

        // arrayList printed using for loop
        System.out.println("---- arrayList printed ----");
        System.out.println(al);

        System.out.println("---- arrayList printed using for loop ----");
        for(int i=0;i<al.size();i++)
          System.out.println(al.get(i));

        System.out.println("---- arrayList printed using Iterator ----");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
