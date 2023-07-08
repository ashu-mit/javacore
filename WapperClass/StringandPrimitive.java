package WapperClass;

public class StringandPrimitive {
    public static void main(String[] args) {
        byte b=100;
        String string=Byte.toString(b);
        System.out.println(string);
        byte b1=Byte.parseByte(string);
        System.out.println(b1);
    }
}
