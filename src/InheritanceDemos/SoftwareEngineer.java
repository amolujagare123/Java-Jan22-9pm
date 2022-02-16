package InheritanceDemos;

public class SoftwareEngineer {

    SoftwareEngineer()
    {
        System.out.println("inside Software Engineer");
    }

    SoftwareEngineer(int a)
    {
        System.out.println("inside Software Engineer");
        System.out.println("a="+a);
    }

    SoftwareEngineer(int a,int b)
    {
        System.out.println("inside Software Engineer");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    int employeeId = 90;
    int x = 100;

    void calculateSalary()
    {
        System.out.println("Software engineer salary");
    }

}

class SoftwareTester extends SoftwareEngineer{
   /*  int employeeId = 90;
    int x = 100;*/
    SoftwareTester()
    {
        super(13,14); // used for calling parent class constructor
        System.out.println("inside Software Tester");
    }

    int employeeId = 10;

    void calculateSalary()
    {

        System.out.println("Software Testers salary");
    }

    void allDetails()
    {
        System.out.println(x);
        System.out.println(employeeId);
        System.out.println(super.employeeId);
        calculateSalary();
        super.calculateSalary();
    }

}

class TestInheritance3
{
    int a;
    public static void main(String[] args) {


        SoftwareTester st = new SoftwareTester();
      //  st.allDetails();
       // System.out.println(super.employeeId);
    }
}
/*

class ABC extends TestInheritance3
{

    int a;

    void method()
    {
        System.out.println();
    }
}
*/
