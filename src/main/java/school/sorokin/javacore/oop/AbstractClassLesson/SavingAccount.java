package school.sorokin.javacore.oop.AbstractClassLesson;

public class SavingAccount extends Account {
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        this.balance -= amount;
    }

    @Override
    public void printInfo() {
        System.out.println("Saving Account");
        System.out.println("Balance: " + balance);
    }
}
