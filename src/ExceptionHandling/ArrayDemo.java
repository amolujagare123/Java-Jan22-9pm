package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 10;
        a[1] = 11;
        a[2] = 20;
        a[3] = 13;
        a[4] = 50;
        a[5] = 19;

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");
    }
}
