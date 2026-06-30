import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(Account account){
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    public void viewAllAccounts(){
        if(accounts.isEmpty()){
            System.out.println("No account.");
        }else{
            for(Account account : accounts){
                account.displayAccount();
            }
        }
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void searchAccount(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("Account not found.");
        }
    }

    public void depositMoney(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        account.deposit(amount);
    }

    public void withdrawMoney(int accountNumber, double amount){
        Account account = findAccount(accountNumber);
        if (account == null){
            System.out.println("Account not found.");
            return;
        }
        account.withdraw(amount);
    }

    public void transferMoney(int senderAccountNumber, int receiverAccountNumber, double amount){
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);

        if(senderAccount == null || receiverAccount == null){
            System.out.println("Account not found");
            return;
        }
        senderAccount.sendMoney(amount);
        receiverAccount.receiveMoney(amount);
    }

    public void deleteAccount(int accountNumber){
        Account account = findAccount(accountNumber);

        if(account == null){
            System.out.println("Account not found.");
            return;
        }
        accounts.remove(account);
    }
}
