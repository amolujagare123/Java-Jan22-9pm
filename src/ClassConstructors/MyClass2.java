package ClassConstructors;

public class MyClass2 {

    int a;
    double d;
    char c;
    String str; // data members

    MyClass2(int x, double y ,char z,String ss) // parameterized constructor
    {
        a = x;
        d = y;
        c = z;
        str = ss;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass2 ob = new MyClass2(77,7.7,'d',"Karan");

        ob.display();

    }

}
