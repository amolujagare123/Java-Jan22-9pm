package AbstractionDemo;

public interface AnotherInterface {


     void run();
     void start();
     void display();

}

interface Interface2
{
    void display();
}

class TestClass
{

}

class ChildInterface2 extends TestClass implements AnotherInterface,Interface2
{


    public void run() {
        System.out.println("run");
    }


    public void start() {
        System.out.println("start");
    }


    public void display() {
        System.out.println("display");
    }
}