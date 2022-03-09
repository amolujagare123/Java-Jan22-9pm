package CollectionDemos.MapDemos;

import java.util.HashMap;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println(hm.isEmpty());
        hm.put(213,"Harshal");
        hm.put(313,"Prafulla");
        hm.put(223,"Pratik");
        hm.put(413,"Priyamvada");
        System.out.println(hm.isEmpty());
        System.out.println("hm="+hm);

        System.out.println("size="+hm.size());
        System.out.println(hm.containsKey(203));

        System.out.println(hm.containsValue("Priyamvada"));


        hm.clear();

        System.out.println("hm="+hm);



    }
}
