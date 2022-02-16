package ClassConstructors.MethodsDemo;

public class MethodsPrameters {

    void getMyInt(int a)
    {
        System.out.println("Inside getMYINt method");
        System.out.println("a="+a);
    }

    void getMyIntMultiple(int a,int b)
    {
        System.out.println("Inside getMyIntMultiple method");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }


    public static void main(String[] args) {

        MethodsPrameters ob = new MethodsPrameters();
        ob.getMyInt(37);
        ob.getMyIntMultiple(20,11);
    }
}
