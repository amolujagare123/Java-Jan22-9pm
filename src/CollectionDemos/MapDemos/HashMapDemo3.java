package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(213,"Harshal");
        hm.put(313,"Prafulla");
        hm.put(223,"Pratik");
        hm.put(413,"Priyamvada");

        System.out.println("hm="+hm);

        System.out.println(hm.get(313));

        hm.remove(223);

        System.out.println("hm="+hm);





    }
}
