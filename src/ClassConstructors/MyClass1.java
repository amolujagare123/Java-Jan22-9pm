package ClassConstructors;

public class MyClass1 {

    int a;
    double d;
    char c;
    String str; // data members

    MyClass1()
    {
        a =11;
        d = 1.1;
        c='x';
        str="Harshal";
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass1 ob = new MyClass1();

        ob.display();

    }

}
