package Packages.twonumber.add;
import static java.lang.System.out;    //here we are doing static import
import java.util.Scanner;
import static java.lang.Math.pow;


public class addTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter two number:");
        Scanner scanner=new Scanner(System.in);
        int i =scanner.nextInt();
        int j=scanner.nextInt();
        int res=i+j;
        out.println("Addition of two numbers are: "+res);
        out.println(pow(44,2));

    }
}
