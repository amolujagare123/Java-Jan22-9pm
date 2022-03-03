package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> al  = new ArrayList<>();

        al.add("Anjali"); // 0
        al.add("Arunna"); // 1
        al.add("Chinamaya"); // 2
        al.add("Deepali"); // 3
        al.add("Harshal"); // 4
        al.add("Harshal"); // 5

        System.out.println("al="+al);

        ArrayList<String> al2  = new ArrayList<>();

        al2.add("Anjali"); // 0
        al2.add("Arunna"); // 1
        al2.add("Chinamaya"); // 2
        al2.add("philip"); // 2
        al2.add("prafulla"); // 2
        al2.add("pallavi"); // 2
        System.out.println("al2="+al2);
        al2.removeAll(al);

        // from al2 all the elements present in al will be removed

        System.out.println("al2="+al2);


    }
}
