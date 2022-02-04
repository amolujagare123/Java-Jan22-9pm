package ArraysDemo;

import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner s = new Scanner(System.in);

        for (int i=0;i<a.length;i++)
        {
            int temp = s.nextInt();
            a[i] = temp;
            //System.out.println(a[i]);
        }

       for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
