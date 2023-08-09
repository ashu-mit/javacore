package Packages.p2;

import Packages.p1.A;

public class C {
    public static void main(String[] args) {
        A.a1();//or we can use fully qulaified name here    Packages.p1.A.a1();
        A a=new A();
        a.a2();
    }
}
