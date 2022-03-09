package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(213,"Harshal");
        hm.put(313,"Prafulla");
        hm.put(223,"Pratik");
        hm.put(413,"Priyamvada");
        hm.put("amol","Priyamvada");
        hm.put('g',null);
        hm.put('h',null);
        hm.put('i',null);
        hm.put(41.3,"Priyamvada");
        hm.put("str",true);

        hm.put(null,true);

        hm.put(null,123); // true


        System.out.println(hm.put(210,"Philip")); //null

        System.out.println(hm);

        System.out.println(hm.put(213,"Vrunda"));// Harshal

        System.out.println(hm);
    }
}
