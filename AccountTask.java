package accounttask;
public class AccountTask {
    public static void main(String[] args) {
     Account acc = new Account(1122, 20000);
        acc.withdraw(2500.00);
        acc.deposit(3000.0);
        acc.setAnnualInterestRate(4.5);
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("Monthly Interest: " + acc.getMonthlyInterest());
        System.out.println("Date Created: " + acc.getDateCreated());
    }
    
}
