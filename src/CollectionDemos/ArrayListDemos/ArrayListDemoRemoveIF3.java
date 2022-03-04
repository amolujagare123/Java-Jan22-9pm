package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveIF3 {

    public static void main(String[] args) {

        ArrayList<Character> al  = new ArrayList<>();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');
        al.add('l');
        al.add('m');
        al.add('n');

        System.out.println("al="+al);
        // remove all vowels

        al.removeIf(k -> (k=='a'||k=='e'||k=='i'||k=='o'||k=='u')  );

        System.out.println("al="+al);





    }
}
