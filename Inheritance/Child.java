package Inheritance;

import AccessModifiers2.C;

public class Child extends Parent{
    void f2()
    {
        System.out.println("Insdie f2(),child class method");
    }
    public Child()
    {
        System.out.println(",Child constructor"+this);
    }
}
