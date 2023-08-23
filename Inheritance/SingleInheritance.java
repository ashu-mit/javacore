package Inheritance;

public class SingleInheritance {
    void m1()
    {
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        SingleInheritance singleInheritance=new SingleInheritance();
        singleInheritance.m1();
        System.out.println(singleInheritance.getClass());
        System.out.println(singleInheritance.hashCode());
    }
}
