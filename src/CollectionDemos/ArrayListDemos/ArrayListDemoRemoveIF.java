package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListDemoRemoveIF {

    public static void main(String[] args) {

        ArrayList<String> al  = new ArrayList<>();

        al.add("Anjali"); // 0
        al.add("Aruna"); // 1
        al.add("Chinamaya"); // 2
        al.add("Deepali"); // 3
        al.add("Harshal"); // 4
        al.add("Harshal"); // 5

        System.out.println("al="+al);

        // 1. remove elements whose first letter starts with A
        //-----------------------------------------------
        // solution choose a varible write into removeIf Method
        // no need to specify its type
        // write predicate symbol ->
        // write the condition

      //  al.removeIf(str -> (str.charAt(0)=='A') );

        // 2. Remove elements whose String length is greater than 7

        al.removeIf(str-> str.length()>7);
        System.out.println("al="+al);





    }
}
