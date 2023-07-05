public class StaticMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Inside main methods");
    StaticMethodsDemo.m1();
    }
        static void m1()
        {
        System.out.println("Inside m1()");
        }
static {
    System.out.println("Inside static block");
    StaticMethodsDemo.m1();
}
    }
