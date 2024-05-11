public class NormalAccount extends Account{
    protected double overdraftlimit = 100000;
    
    @Override
    public void withdraw(double amount) {
        if(amount >= getBalance() || amount >= overdraftlimit)
        {
            System.out.println("Invalid withdraw Amount");
        }
        else
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw successfully");
            System.out.println("Your current balance is : " + getBalance());
        }
    }

    public NormalAccount(int accountid, String accountname, double balance, double overdraftlimit)
    {
        super(accountid,accountname,balance);
        this.overdraftlimit = overdraftlimit;
    }
    public NormalAccount()
    {
        super();
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Overdraft Limit : " + overdraftlimit);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }


}
