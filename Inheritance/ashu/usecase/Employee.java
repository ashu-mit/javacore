package Inheritance.ashu.usecase;

public class Employee {
    int id;
    String name;
    String dept;
    double salary;

    public Employee(int id, String name, String dept, double salary) {
        System.out.println("Employee constructor invoke");

        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
                // If we make a method as final then we cant override it
    protected final void work() //protected is used so this method is only used by the class which is inheriting it
    {
        System.out.println("common work fro everyone");
    }
}
