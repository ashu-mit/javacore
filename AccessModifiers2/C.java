package AccessModifiers2;

import AccessModifiers.A;

public class C extends A {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.l); //public


        C obj1=new C();
        System.out.println(obj1.k);  //protected fields can be inherited and accessed
        System.out.println(obj.l);    //public
    }
}
