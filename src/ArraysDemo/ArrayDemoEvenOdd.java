package ArraysDemo;

public class ArrayDemoEvenOdd {

    public static void main(String[] args) {

        // even odd number
        int[] a = {12,42,1,13,4,43,46,12,12};

        for (int i = 0; i<a.length;i++) {
            if(a[i]%2 == 0)
              System.out.println(a[i] +" Even");
            else
                System.out.println(a[i] +" Odd");
        }


        float f = 4.5f;
    }
}
