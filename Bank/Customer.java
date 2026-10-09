public class Customer {

    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account account){
        if (numberOfAccounts<5){
            accounts[numberOfAccounts++] = account;
        }
    }

    public Account getAccount(int account_index){
        return accounts[account_index];
    }

    public int getNumOfAccount(){
        return numberOfAccounts;
    }
}