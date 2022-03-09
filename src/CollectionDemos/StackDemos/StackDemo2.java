package CollectionDemos.StackDemos;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("Anjali"); // 0
        s.push("Aruna"); // 1
        s.push("Chinamaya"); // 2
        s.push("Deepali"); // 3
        s.push("Harshal"); // 4
        s.push("Harshal"); // 5

        System.out.println(s);

        System.out.println(s.search("Anjali"));


    }
}
