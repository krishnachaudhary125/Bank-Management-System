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
                    System.out.println("--------------------------------------------------------");
                    Account account = new Account(
                            accountNumber, accountHolderName, phoneNumber, email, address, accountType, balance
                    );
                    bank.createAccount(account);
                    System.out.println("--------------------------------------------------------");}
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice != 8);
    }
}
