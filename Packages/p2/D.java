package Packages.p2;
import Packages.p1.A;

public class D {
    public static void main(String[] args) {
        A.a1();
        Packages.p1.A.a1();//we have two class with same name in package structure ,better to use fully qulaified name
    }
}
