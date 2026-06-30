import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(Account account){
        accounts.add(account);
        System.out.println("Account created successfully.");
    }
}
