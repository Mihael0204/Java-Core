package school.sorokin.javacore.oop.AbstractClassLesson;

public class CreditAccount extends Account {
    public CreditAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public void printInfo() {
        System.out.println("Credit Account");
        System.out.println("Balance: " + balance);
    }
}
