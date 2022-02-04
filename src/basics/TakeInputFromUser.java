package basics;

import java.util.Scanner;

public class TakeInputFromUser {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // read a string

        String str = s.nextLine();
        System.out.println("String is = "+str);

        int a = s.nextInt();
        System.out.println("Int value is = "+a);

        float f =s.nextFloat();
        System.out.println("float value is = "+f);




    }
}
