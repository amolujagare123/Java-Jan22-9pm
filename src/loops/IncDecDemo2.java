package loops;

public class IncDecDemo2 {

    /*
    a++ / a - - ( post operator)
    → here first the statement is executed and
    then the increment/decrement happens

    ++a / - - a ( pre operator)
    → here first increment/decrement happens,
    then statement is executed
*/
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i); // 10
        System.out.println(i--); // 10
        System.out.println(i); // 9
        System.out.println(--i); // 8
        System.out.println(i); // 8
    }


}
