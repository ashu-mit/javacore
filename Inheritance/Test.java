package Inheritance;

public class Test {
    public static void main(String[] args) {
        Child child=new Child();
        child.f2();
        child.f1();//we are able to access the method of parent class as well here
        child.hashCode();  //parent inherit java.lang.object implictly so we get all method here as well

    }
}
