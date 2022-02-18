package InheritanceDemos.polymorphismDemo;

public final class OverridingDemo {

    /*final*/ void common()
    {
        System.out.println("parents common method");
    }
}

class Child extends OverridingDemo
{
    // we can not reduce the scope of the method
    void common()
    {
        System.out.println("Child common method");
    }

    public static void main(String[] args) {

        OverridingDemo ob = new Child(); // upcasting

        ob.common();
    }
}
