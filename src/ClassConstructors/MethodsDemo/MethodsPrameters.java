package ClassConstructors.MethodsDemo;

import ClassConstructors.TestMyClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodsPrameters {

    void getMyInt(int a)
    {
        System.out.println("Inside getMYINt method");
        System.out.println("a="+a);
    }

    void getMyIntMultiple(int a,int b)
    {
        System.out.println("Inside getMyIntMultiple method");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    void getMyDetails(int id,String name,int salary)
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }

    void getTheDate(Date date)
    {
        System.out.println(date);
    }

    void getMyArray(int[] x)
    {

        for (int i=0;i<x.length;i++)
            System.out.print(x[i]+" ");

        System.out.println();
    }

    void setTheObject(TestMyClass obj)
    {
        obj.a = 90;
        obj.d = 9.90;
        obj.c = 'u';
        obj.str = "Namrata";
    }

    void getMyTwoDArray(String[][] myStr)
    {
        for (int i=0;i<myStr.length;i++)
        {
            for (int j=0;j<myStr[0].length;j++)
            {
                System.out.print(myStr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws ParseException {

        MethodsPrameters ob = new MethodsPrameters();
     /*   ob.getMyInt(37);
        ob.getMyIntMultiple(20,11);
        ob.getMyDetails(12,"Ashish",45000);*/

        Date myDate = new SimpleDateFormat("dd/MM/yyyy").parse("12/02/2002");
        ob.getTheDate(myDate);

        int[] a = {34,56,23,11,78,90,11};

        //ob.getMyArray(a);

        String[][] stArr = {
                {"abc1","xyz1","pqr1"},
                {"abc2","xyz2","pqr2"},
                {"abc3","xyz3","pqr3"},
                {"abc4","xyz4","pqr4"},
                {"abc5","xyz5","pqr5"},
        };

       // ob.getMyTwoDArray(stArr);

        TestMyClass testMyClass = new TestMyClass();

        ob.setTheObject(testMyClass);

        testMyClass.display();
    }
}
