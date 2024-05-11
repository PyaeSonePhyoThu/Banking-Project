import java.util.Scanner;

public abstract class Account {
    protected int accountid;
    protected String accountname;
    protected double balance;

    public Account(int accountid, String accountname, double balance)
    {
        this.accountid = getAccountid();
        this.accountname = getAccountname();
        this.balance = getBalance();
    }

    public Account()
    {

    }

    public int getAccountid() {
        return accountid;
    }
    public void setAccountid(int accountid) {
        String account = Integer.toString(accountid);
        try {
            if(account.length() < 4)
            {
                this.accountid = accountid;  
                return;
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID format. ID Format : ####");
            setAccountid(accountid);
        }
    }

    public String getAccountname() {
        return accountname;
    }
    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
    public abstract void withdraw(double amount);

    public void displayInformation()
    {
        System.out.println("Account ID : " + getAccountid());
        System.out.println("Account Name : " + getAccountname());
        System.out.println("Balance : " + getBalance());
    }

    public void createAccount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account ID : ");
        setAccountid(scanner.nextInt());
        System.out.println();
        scanner.nextLine();
        System.out.print("Enter account Name : ");
        setAccountname(scanner.nextLine());
        System.out.println();
        System.out.print("Enter balance : ");
        setBalance(scanner.nextDouble());
        System.out.println();
    }

}
