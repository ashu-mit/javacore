public class NonStaticMemberDemo
{
    int num;
    NonStaticMemberDemo()
    {
        System.out.println("Inside the constructor");
    }
    {
        System.out.println("Inside non static block");
    }
    static
    {
        System.out.println("Inside static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        new NonStaticMemberDemo();
        new NonStaticMemberDemo();
        new NonStaticMemberDemo();
    }
}