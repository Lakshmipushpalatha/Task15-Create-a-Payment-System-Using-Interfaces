import java.util.Scanner;

interface Payment {
    void processPayment(double amount);
}

class CardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Payment processed using Card.");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Payment processed using UPI.");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}

class WalletPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Payment processed using Wallet.");
        System.out.println("Amount Paid: Rs. " + amount);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PAYMENT SYSTEM =====");

        System.out.print("Enter payment amount: Rs. ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount! Please enter an amount greater than zero.");
        } else {

            System.out.println("\nSelect Payment Method:");
            System.out.println("1. Card Payment");
            System.out.println("2. UPI Payment");
            System.out.println("3. Wallet Payment");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            Payment payment = null;

            switch (choice) {
                case 1:
                    payment = new CardPayment();
                    break;

                case 2:
                    payment = new UPIPayment();
                    break;

                case 3:
                    payment = new WalletPayment();
                    break;

                default:
                    System.out.println("Invalid payment choice!");
            }

            if (payment != null) {
                payment.processPayment(amount);
                System.out.println("Payment Successful!");
            }
        }

        sc.close();
    }
}
