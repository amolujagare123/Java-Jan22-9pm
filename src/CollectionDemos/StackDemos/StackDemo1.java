package CollectionDemos.StackDemos;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        System.out.println(s.empty());
        s.push("Anjali"); // 0
        s.push("Arunna"); // 1
        s.push("Chinamaya"); // 2
        s.push("Deepali"); // 3
        s.push("Harshal"); // 4
        s.push("Harshal"); // 5
        System.out.println(s.empty());
        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s);
    }
}
