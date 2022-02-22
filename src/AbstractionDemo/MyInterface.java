package AbstractionDemo;

public interface MyInterface {

    void start();
    void run();

    default void display()
    {
        System.out.println("dispay");
    }

    static void display1()
    {
        System.out.println("dispay1");
    }

    private void display2()
    {
        System.out.println("dispay2");
    }

}


class ChildInterface implements MyInterface
{
    public void run()
    {
        System.out.println("run");
    }

    public void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        MyInterface ob = new ChildInterface();
        ob.start();
        ob.run();
        ob.display();
        MyInterface.display1();
      //  ob.display2(); // private method
    }

}