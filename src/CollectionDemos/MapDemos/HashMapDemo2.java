package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(213,"Harshal");
        hm.put(313,"Prafulla");
        hm.put(223,"Pratik");
        hm.put(413,"Priyamvada");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm1 = new HashMap<>();
        System.out.println("hm1="+hm1);

        hm1.putAll(hm);
        System.out.println("hm1="+hm1);



    }
}
