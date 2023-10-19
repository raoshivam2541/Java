import java.util.Scanner;

public class ATM {
    public static void main(String[] args) 
    {
        int balance = 10000;
        boolean valid = true;
        String c;
        int widraw = 0, deposite = 0;
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("What action you want to perform?\n1.Check BALANCE\n2.WITHDRAW\n3.DEPOSITE");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        while (valid) {
            switch (choice) 
            {
                case 1:

                    System.out.println("Current Balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount: ");
                    widraw = sc.nextInt();
                    System.out.println("Amount you withdraw " + widraw);
                    balance = balance - widraw;
                    System.out.println("Current balance: " + balance);
                    break;
                case 3:
                    System.out.println("Enter amount: ");
                    deposite = sc.nextInt();
                    System.out.println(" deposited amount: " + deposite);
                    balance = balance + deposite;
                    System.out.println("Current Balance: " + balance);
                    break;
                default:
                    System.out.println("entered wrong choice....");
            }
            System.out.println("continue(y/n)");
            c = sc.next();
            if (c == "n" || c == "N") {
                break;
            }
        }
        sc.close();

    }
}