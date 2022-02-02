package loops;

public class IncDecDemo {

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
        System.out.println(i++); // 10
        System.out.println(i); // 11
        System.out.println(++i); // 12
        System.out.println(i); // 12
    }


}
