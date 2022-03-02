package WrapperClass;

public class WrapperClassDemo {

    public static void main(String[] args) {
        int i =5; // primitive to non primitive
        Integer ii = new Integer(5); // boxing / wrapping
        System.out.println("ii="+ii);

        Integer ii1 = i; // autoboxing / auto unwrapping

        double d = 9.9;

        Double dd = new Double(d);
        System.out.println("dd="+dd);

        //-------------------------------

        Integer ii2 = new Integer(10); // non primitive to primitive
        int i2 = ii2.intValue(); // unboxing / unwrapping
        int i22 = ii2 ; // auto unboxing /auto unwrapping

    }
}
