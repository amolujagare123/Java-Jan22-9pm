package InheritanceDemos;

public class Employee {

    int salary = 10000;

    void EmployeeRole()
    {
        System.out.println("Attend meeting");
    }

}

class Programmer extends Employee
{
    int bonus = 2000;

    void programmerRole()
    {
        System.out.println("Write a code");
    }
}

class TestInheritance
{
    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerRole();

        System.out.println(p.salary);
        p.EmployeeRole();

    }
}
