import java.util.ArrayList;
import java.util.Scanner;
public class BankAccountArrayBeraksi{
    public static void main(String[] args){
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(1001));
        accounts.add(new BankAccount(1015));
        accounts.add(new BankAccount(1729));
        accounts.add(1, new BankAccount(1008));
        accounts.remove(0);

        Scanner customer = new Scanner(Sytem.in);

        String firstName = customer.nextLine();
        String lastName = customer.nextLine();
    }
}