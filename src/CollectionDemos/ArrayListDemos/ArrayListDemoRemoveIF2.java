package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveIF2 {

    public static void main(String[] args) {

        ArrayList<Integer> al  = new ArrayList<>();

        al.add(11);
        al.add(31);
        al.add(12);
        al.add(22);
        al.add(41);
        al.add(15);
        al.add(18);
        al.add(41);

        System.out.println("al="+al);
        // remove the elements which are odd numbers

        al.removeIf(a -> a%2 != 0);

        System.out.println("al="+al);





    }
}
