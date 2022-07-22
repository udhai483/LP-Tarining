package ChainOfResponsibility;

import java.util.Scanner;

public class ResponsibilityDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println(
                        "Please enter amount to withdraw " +
                                "(500,1000,2000,5000, max 100,000/=, Press Ctrl + C to end): ");
                int Amount = scanner.nextInt();
                if (isValid(Amount)) {
                    ATMWithdrawal.withdraw(new PaperCurrency(Amount));
                }
            } while (true);
        }
    }
    private static boolean isValid(int Amount) {
        if (Amount <= 0) {
            System.out.println("Invalid Amount. Try again!");
            return false;
        } else if (Amount > 100000) {
            System.out.println("Daily withdrawal limit is 100,000/=. Try again!");
            return false;
        } else if (Amount % 500 != 0) {
            System.out.println("Amount must be multiple of 500s, Try again!");
            return false;
        }
        return true;
    }
}
