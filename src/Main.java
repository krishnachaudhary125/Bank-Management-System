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


        }while(choice != 8);
    }
}
