public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount){
        if (balance >= amount){
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }
}