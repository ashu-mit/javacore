package AccessModifiers;

public class A {
    private int i=10;
    int j=20;
    protected int k=30;
    public int l=40;
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.k);
        System.out.println(obj.l);

    }
}
