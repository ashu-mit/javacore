public class Demo1 {
    static Demo1 obj=new Demo1();
    static{
    System.out.println(obj);

        Demo1.obj=Demo1.m1();
    }
    public static void main(String[] args) {
    System.out.println(Demo1.obj);
    }
    public static Demo1 m1()
    {
        Demo1 obj=new Demo1();
       return obj;
    }
}