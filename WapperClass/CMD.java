package WapperClass;

public class CMD {
    public static void main(String[] args) {
        int length=args.length;
        if(length==0)
        {
            System.out.println("No arguments are there");
        }
        else {
            for (int i=0;i<length;i++)
            {
                System.out.print(args[i] +" ");
            }
        }
    }
}
