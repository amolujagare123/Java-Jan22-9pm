package ClassConstructors.pack1;

public class Java1 {

    public int a ;
    public double d;
    private char c;
   protected String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        Java1 ob = new Java1();

        ob.a = 78;
        ob.d = 9.8;
        ob.c = 'g';
        ob.str = "amol";
        ob.display();


    }

}
