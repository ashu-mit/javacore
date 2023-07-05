public class NonStaticMethodsInvoke
{
    public static void main(String[] args) {
        NonStaticMethodsInvoke obj=new NonStaticMethodsInvoke();
        obj.aaa();
    }
    void aaa()
    {
        System.out.println("This one is non static method");
    }
}