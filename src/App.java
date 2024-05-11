import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Account>accounts = new ArrayList<>();
        accounts.add(new NormalAccount());
        accounts.get(0).createAccount();
        accounts.get(0).displayInformation();
        accounts.get(0).withdraw(100000);
        accounts.get(0).withdraw(50000);
        accounts.get(0).displayInformation();
    }
}
