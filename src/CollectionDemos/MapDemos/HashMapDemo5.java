package CollectionDemos.MapDemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo5 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(213,"Harshal");
        hm.put(313,"Prafulla");
        hm.put(223,"Pratik");
        hm.put(413,"Priyamvada");

        System.out.println("hm="+hm);

        Set keySet = hm.keySet();

        System.out.println("KeySet="+keySet);

        Collection values = hm.values();
        System.out.println("values="+values);

        Set entrySet = hm.entrySet();
        System.out.println("entrySet="+entrySet);





    }
}
