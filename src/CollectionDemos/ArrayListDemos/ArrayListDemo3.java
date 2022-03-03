package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {

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

        System.out.println("al2="+al2);

        al2.addAll(al);

        System.out.println("al2="+al2);


    }
}
