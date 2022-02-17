package ClassConstructors;

public class TestMyClass {

    public int a ;
    public double d;
    public char c;
    public String str; // data members

    public void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        TestMyClass testMyClass = new TestMyClass();
        testMyClass.display();
    }

}
