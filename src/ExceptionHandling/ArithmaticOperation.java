package ExceptionHandling;

public class ArithmaticOperation {

    public static void main(String[] args) {

        int a;
        int b = 0;
        int c = 1;

        try {
            a = 10;
            c = a / b;
        }
        catch (ArithmeticException e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            //e.printStackTrace();
            System.out.println(e);
        }

        catch (RuntimeException e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            //e.printStackTrace();
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            //e.printStackTrace();
            System.out.println(e);
        }
        finally {
            System.out.println("inside finally");
        }


        System.out.println("c="+c);
        System.out.println("End of the program");
    }
}
