package CollectionDemos.VectorDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("Anjali"); // 0
        v.add("Arunna"); // 1
        v.add("Chinamaya"); // 2
        v.add("Deepali"); // 3
        v.add("Harshal"); // 4
        v.add("Harshal"); // 5

        System.out.println(v);


       /* Iterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
