public class Account {
    private int accountNumber;
    private String accountHolderName;
    private String phoneNumber;
    private String email;
    private String address;
    private String accountType;
    private double balance;

    public Account(int accountNumber, String accountHolderName, String phoneNumber, String email, String address, String accountType, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccount(){
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Account Number      : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Phone Number        : "+phoneNumber);
        System.out.println("Email               : "+email);
        System.out.println("Address             : "+address);
        System.out.println("Account Type        : "+accountType);
        System.out.println("Balance             : "+balance);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Deposit Successful!");
            System.out.println("Current Balance: " + balance);
        }else{
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Withdraw Successful!");
            System.out.println("Withdrawn amount: "+ amount);
            System.out.println("Current Balance: " + balance);
        }else if(amount > balance){
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Invalid amount.");
        }
    }

    public void sendMoney(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Transferred successful!");
            System.out.println("Transferred amount : "+amount);
            System.out.println("Current Balance: " + balance);
        }else if(amount > balance) {
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Insufficient balance.");
        }else{
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Invalid amount.");
        }
    }
    public void receiveMoney(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("\n--------------------------------------------------------");
            System.out.println("Amount received successfully!");
            System.out.println("Received amount : "+amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}