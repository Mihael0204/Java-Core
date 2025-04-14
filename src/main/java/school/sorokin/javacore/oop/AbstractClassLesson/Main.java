package school.sorokin.javacore.oop.AbstractClassLesson;

public class Main {
    public static void main(String[] args) {
        Account saveAcc = new SavingAccount(500);
        Account creditAcc = new CreditAccount(300);
        saveAcc.deposit(50);
        creditAcc.deposit(200);
        saveAcc.withdraw(600);
        creditAcc.withdraw(600);

        Account[] accounts = new Account[]{creditAcc, saveAcc};
        for (Account account : accounts) {
            account.printInfo();
        }

        Printable printable = new SavingAccount(200);
        printable.printInfo();
    }
}
