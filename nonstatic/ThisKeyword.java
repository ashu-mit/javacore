public class ThisKeyword {
    int x;
    ThisKeyword()
    {
        System.out.println(this);
        System.out.println(x);
    }

    public static void main(String[] args) {
        new ThisKeyword();
        new ThisKeyword();

    }
}