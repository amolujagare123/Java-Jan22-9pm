package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)  // number is in between 1-10 or not
    {
        if(i<=10 && i>1)
            System.out.println("We are safe");
        else
            throw new Error("We are in danger");
    }

    public static void main(String[] args) {

        System.out.println("start of the program");
        System.out.println("below is the number");

        int a = 11;
        ThrowDemo ob = new ThrowDemo();
        ob.checkNumber(a);

        System.out.println("a="+a);

        System.out.println("below is the square of a");

        System.out.println("square of a="+a*a);

        System.out.println("end of the program");


    }
}
