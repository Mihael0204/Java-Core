package school.sorokin.javacore.oop.AbstractClassLesson;

public abstract class Account implements Printable {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);
}
