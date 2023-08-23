package Inheritance.ashu.usecase;

public class Test {
    public static void main(String[] args) {
        String[] project=new String[] {"Flight reservarion","Check in"};
        Manager manager = new Manager(1, "aashu", "IT", 2000.30, project);
        System.out.println(manager.id);
        System.out.println(manager.name);
        System.out.println(manager.dept);
        System.out.println(manager.salary);
        manager.work();
        System.out.println("------------------------------------------");
        Developer developer = new Developer(2,"ramesh","IT",30000,"JAVA FSE");
        System.out.println(developer.id);
        System.out.println(developer.name);
        System.out.println(developer.dept);
        System.out.println(developer.salary);
        developer.work();
    }
    }
