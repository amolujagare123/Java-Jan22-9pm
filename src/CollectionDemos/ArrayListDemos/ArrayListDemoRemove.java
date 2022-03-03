package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemove {

    public static void main(String[] args) {

        ArrayList<String> al  = new ArrayList<>();

        al.add("Anjali"); // 0
        al.add("Arunna"); // 1
        al.add("Chinamaya"); // 2
        al.add("Deepali"); // 3
        al.add("Harshal"); // 4
        al.add("Harshal"); // 5

        System.out.println("al="+al);

        al.remove("Anjali");

        System.out.println("al="+al);



    }
}
