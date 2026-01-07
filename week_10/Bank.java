
public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456",10000, "Gaurav");
        System.out.println("Account Owner: " + account.getOwnerName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(5000);
        System.out.println("Balance after deposit of 5000: " + account.getBalance());
        boolean success = account.withdraw(3000);
        if (success) {
            System.out.println("Balance after withdrawal of 3000: " + account.getBalance());
        } else {
            System.out.println("Withdrawal of 3000 failed due to insufficient funds.");
        }
    }
}