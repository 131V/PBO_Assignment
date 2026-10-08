public class Bank{
    private double balance;
    private static int validTransaction;

    public Bank(double balance){
        this.balance = balance;
    }
        
    public void deposit(double money){
        this.balance += money;
        validTransaction++;
    }

    public void withdraw(double money){
        if (money <= this.balance){
            this.balance -= money;
            validTransaction++;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance(){return balance;}
    public void setBalance(double money){this.balance = balance;}

    public int getValidTransaction(){return validTransaction;}
}