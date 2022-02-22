package AbstractionDemo;

public abstract class AbstractClassDemo {

    abstract void run();
    abstract void start();

    void display()
    {
        System.out.println("display --> AbstractClassDemo ");
    }

   /* public static void main(String[] args) {
        AbstractClassDemo ob = new AbstractClassDemo();
    }*/
}

class ChildAbstract extends AbstractClassDemo
{
    void run()
    {
        System.out.println("run");
    }

    void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClassDemo ob = new ChildAbstract();

        ob.run();
        ob.start();

    }
}

