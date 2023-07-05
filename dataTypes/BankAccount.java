package dataTypes;

public class BankAccount {
    static String name="Bank of America";
    String accHolderName;//we make it as a non static because balance and accNumber and name is
                        //different for all accoun holders
    long accountNumber;
    float balance;

    public static void main(String[] args) {
        System.out.println(BankAccount.name);//we are able to access static member directly using class name
        BankAccount b=new BankAccount();
        b.accHolderName="john";
        b.accountNumber=78326461;
        b.balance=321.23f;

        System.out.println(b.balance);

    }
}
