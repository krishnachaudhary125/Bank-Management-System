import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;
        do{
            System.out.println("\n--------------------------------------------------------");
            System.out.println("1. Create Account");
            System.out.println("2. View All Account");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Transfer Money");
            System.out.println("7. Delete Account");
            System.out.println("8. Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1:{
                    System.out.println("\n--------------------------------------------------------");
                    System.out.print("Enter account number  : ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter your name       : ");
                    String accountHolderName = sc.nextLine();
                    System.out.print("Enter phone number    : ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter email           : ");
                    String email = sc.nextLine();
                    System.out.print("Enter address         : ");
                    String address = sc.nextLine();
                    System.out.print("Enter account type    : ");
                    String accountType = sc.nextLine();
                    System.out.print("Enter opening balance : ");
                    double balance = sc.nextDouble();
                    Account account = new Account(
                            accountNumber, accountHolderName, phoneNumber, email, address, accountType, balance
                    );
                    bank.createAccount(account);}
                    break;

                case 2:
                    bank.viewAllAccounts();
                    break;

                case 3:{
                    System.out.println("\n--------------------------------------------------------");
                    System.out.print("Enter account number : ");
                    int accountNumber = sc.nextInt();
                    bank.searchAccount(accountNumber);}
                    break;

                case 4:{
                    System.out.println("\n--------------------------------------------------------");
                    System.out.print("Enter account number : ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter balance      : ");
                    double amount = sc.nextDouble();
                    bank.depositMoney(accountNumber, amount);}
                    break;

                case 5:{
                    System.out.println("\n--------------------------------------------------------");
                    System.out.print("Enter account number : ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter balance      : ");
                    double amount = sc.nextDouble();
                    bank.withdrawMoney(accountNumber, amount);}
                    break;

                case 6:
                    System.out.println("\n--------------------------------------------------------");
                    System.out.print("Enter sender account number : ");
                    int senderAccountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Receiver account number : ");
                    int receiverAccountNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the amount to transfer : ");
                    double amount = sc.nextDouble();
                    bank.transferMoney(senderAccountNumber, receiverAccountNumber, amount);
                    break;

                case 7:
                    System.out.println("\n--------------------------------------------------------");
                    System.out.println("Enter account number to delete account : ");
                    int accountNumber = sc.nextInt();
                    sc.nextLine();
                    bank.deleteAccount(accountNumber);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice != 8);
    }
}

//case 8:
//        System.out.println("Thank you for using Bank Management System!");
//    scanner.close();
//    System.exit(0);
