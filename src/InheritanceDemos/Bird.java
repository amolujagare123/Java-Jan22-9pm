package InheritanceDemos;

public class Bird {

    void fly()
    {
        System.out.println("fly");
    }
}

class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("yellow");
    }
}

class crow extends Bird
{
    void crowColor()
    {
        System.out.println("black");
    }
}

class TestInheritance2
{
    public static void main(String[] args) {

        Bird b = new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        crow c = new crow();
        c.crowColor();
        c.fly();
    }
}

