package InheritanceDemos.polymorphismDemo;

public class Addition {

    int a;
    int b;


    void addition()
    {
        int c;
        c = a+b;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y)
    {
        int c;
        c = x+y;
        System.out.println("Addition="+c);
    }
    void addition(double x,double y)
    {
        double c;
        c = x+y;
        System.out.println("Addition="+c);
    }

    void addition(String x,String y)
    {
        String c;
        c = x+y;
        System.out.println("Addition="+c);
    }

    void addition(int x,int y,int z)
    {
        int c;
        c = x+y+z;
        System.out.println("Addition="+c);
    }

    public static void main(String[] args) {

        Addition ob = new Addition();
        ob.a = 11;
        ob.b =22;
        ob.addition();

        ob.addition(23,11);
        ob.addition(20,30,40);

        ob.addition(23.45,25.11);
        ob.addition("Java+","Selenium");


    }
}
