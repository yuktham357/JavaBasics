import java.util.*;

public class BankTransactionManager {
    private static Deque<Transaction> transactionHistory = new ArrayDeque<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n Bank Transaction Menu");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Last 5 Transactions");
            System.out.println("3. Undo Last Transaction");
            System.out.println("4. View All Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addTransaction(sc);
                case 2 -> viewLast5();
                case 3 -> undoLast();
                case 4 -> viewAll();
                case 5 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
    private static void addTransaction(Scanner sc) {
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter transaction type (Deposit/Withdrawal): ");
        String type = sc.nextLine();
        System.out.print("Enter amount: ₹");
        double amount = sc.nextDouble();
        Transaction transaction = new Transaction(type, amount);
        transactionHistory.addLast(transaction);
        System.out.println("✅ Transaction added.");
    }
    private static void viewLast5() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("📄 Last 5 Transactions:");
        int count = 0;
        Iterator<Transaction> descItr = transactionHistory.descendingIterator();
        while (descItr.hasNext() && count < 5) {
            System.out.println(descItr.next());
            count++;
        }
    }
    private static void undoLast() {
        if (transactionHistory.isEmpty()) {
            System.out.println("❌ No transaction to undo.");
        } else {
            Transaction removed = transactionHistory.removeLast();
            System.out.println("🔁 Last transaction undone: " + removed);
        }
    }
    private static void viewAll() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions recorded.");
            return;
        }
        System.out.println("📜 All Transactions:");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}
