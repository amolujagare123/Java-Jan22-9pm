package ClassConstructors;

public class MyClass {

    int a ;
    double d;
    char c;
    String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

       int x;
        x = 10;
        System.out.println(x);

        MyClass ob = new MyClass();

        ob.a = 78;
        ob.d = 9.8;
        ob.c = 'g';
        ob.str = "amol";
        ob.display();

        MyClass ob1 = new MyClass();
        ob1.a = 99;
        ob1.d =9.9;
        ob1.c ='c';
        ob1.str="priya";

        ob1.display();

    }

}
