package ClassConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str; // data members

    MyClass3(int a, double d , char c, String str) // parameterized constructor with this operator
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(77,7.7,'d',"Karan");

        ob.display();

    }

}
