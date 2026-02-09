import java.util.Scanner;

public class ATM {
    Account account = new Account();
    Scanner sc = new Scanner(System.in);



    void showMenu() {
        System.out.println("\n--- ATM MENU ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Choose option: ");
    }

    void start() {
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        if (pin != 1234) {
            System.out.println("Invalid PIN");
            return;
        }

        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.checkbalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int dep = sc.nextInt();
                    account.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int wd = sc.nextInt();
                    account.withdraw(wd);
                    break;

                case 4:
                    System.out.println("Thank you. Visit again!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
