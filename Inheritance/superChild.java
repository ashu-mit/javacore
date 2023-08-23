package Inheritance;

public class superChild extends superKeyword{
    int c,d;

    public superChild(int a,int b,int c,int d) {
        super(a,b);
        this.c=c;
        this.d=d;
    }
    void displayDetails()
    {
        System.out.println("parent a "+super.a);
        System.out.println("parent b "+super.b);
        System.out.println("parent b "+c);
        System.out.println("parent b "+d);
    }

    @Override
    public void f1()
    {
        super.f1();
        System.out.println("INSIDE CHILD f1");
    }
}
