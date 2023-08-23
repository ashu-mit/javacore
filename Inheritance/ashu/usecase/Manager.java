package Inheritance.ashu.usecase;

public class Manager extends Employee{
    String[] projects;
    public Manager(int id, String name, String dept, double salary,String[] projects) {
        super(id, name, dept, salary);
        System.out.println("Manager constructor invoke");
        this.projects=projects;
    }

    @Override
    protected void work()
    {
        super.work();
        System.out.println("Manager is managing");
    for (int i=0;i>=projects.length;i++)
    {
        System.out.println(projects[i]);
    }
    }
}
