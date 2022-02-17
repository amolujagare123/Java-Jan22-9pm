package ClassConstructors.MethodsDemo;

import ClassConstructors.TestMyClass;

public class MethodsReturningValue {

    int myMethod()
    {
        //System.out.println("inside mymethod");
      //  return 10;
        int a =25;
        return  a;
    }

    String getTheString()
    {
        String str = "This will be returned";

        return str;
    }

    int[] myArray()
    {
        int[] arr = {12,34,54,11,56};

        return arr;
    }

    String[][] get2DArray()
    {
        String[][] stArr = {
                {"amol1","rahul1","rohit1"},
                {"amol2","rahul2","rohit2"},
                {"amol3","rahul3","rohit3"},
                {"amol4","rahul4","rohit4"},

        };

        return stArr;
    }

    TestMyClass getLoadedObject()
    {
       // int a;
        TestMyClass obj = new TestMyClass();
        obj.a =10;
        obj.d=1.1;
        obj.c='a';
        obj.str="java";

        return obj;
    }


    public static void main(String[] args) {

        int x ;
        x = 10 ;
       //System.out.println(x);
        int a = x;

        MethodsReturningValue ob = new MethodsReturningValue();

        System.out.println(ob.myMethod());

        int myValue = ob.myMethod();

        System.out.println("My value = "+myValue);


        int[] myArray = ob.myArray();

        for (int i=0;i<myArray.length;i++)
            System.out.println(myArray[i]);

        System.out.println(ob.getTheString());

        String[][] myTwoDString = ob.get2DArray();

        for (int i=0;i<myTwoDString.length;i++)
        {
            for (int j=0;j<myTwoDString[0].length;j++)
            {
                System.out.print(myTwoDString[i][j]+" " );
            }
            System.out.println();
        }


        TestMyClass testMyClass = ob.getLoadedObject();
        testMyClass.display();
    }
}
