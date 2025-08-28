package bankSystem;
class Account {
    private long accountNumber;
    private String holderName;
    private double balance;

    Account() {
        System.out.println("default constructor called");
    }

    Account(String var3, double var4) {
        this();
        this.accountNumber = generateAccountNumber();
        this.holderName = var3;
        this.balance = var4;
    }

    private static long generateAccountNumber() {
        return (long)Math.random();
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setAccountNumber(long var1) {
        this.accountNumber = var1;
    }

    public void setHolderName(String var1) {
        this.holderName = var1;
    }

    public void setBalance(double var1) throws Exception {
        if(var1 < 0) {
            throw new Exception("Balance cannot be negative");
        }
        this.balance = var1;
    }

    private static void thisIsStaticMethod() {
        System.out.println("This is a private static method");
    }

    void displayAccountDetails() {
        System.out.println("Account number: " + this.accountNumber + "\nHolder name: " + this.holderName + "\nBalance: "
                + this.balance);
    }

    public String toString() {
        return "Account number: " + this.accountNumber + "\nHolder name: " + this.holderName + "\nBalance: "
                + this.balance;
    }
}
class SavingAccount extends Account {

    SavingAccount(String var3, double var4) {
        super(var3, var4);
    }
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
    }
}
class CurrentAccount extends Account{

    CurrentAccount(String var3, double var4) {
        super(var3, var4);
    }

    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
    }
}

abstract class Transaction {
    Transaction() {
        System.out.println("Transaction constructor");
    }
    abstract void execute();
}
class DepositTransaction extends Transaction {
    private Account account;
    private double amount;
    DepositTransaction(Account acc, double amount) {
        super();
        account = acc;
        this.amount = amount;
    }
    @Override
    void execute() {
        double currentBalance = account.getBalance();
        try {
            account.setBalance(currentBalance + this.amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class WithdrawTransaction extends Transaction {
    private Account account;
    private double amount;
    WithdrawTransaction(Account acc, double amount) {
        super();
        account = acc;
        this.amount = amount;
    }
    @Override
    void execute() {
        double currentBalance = account.getBalance();
        try {
            account.setBalance(currentBalance - this.amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
interface Payment {
    void pay(double amount) throws Exception;
}
class UpiPayment implements Payment{
    private Account account;
    UpiPayment(Account acc) {
        account = acc;
    }

    public void pay(double amount) throws Exception {
        double currentBalance = account.getBalance();
        account.setBalance(currentBalance + amount + 50);
    }
}
class CardPayment implements Payment{
    private Account account;
    CardPayment(Account acc) {
        account = acc;
    }

    public void pay(double amount) throws Exception {
        double currentBalance = account.getBalance();
        account.setBalance(currentBalance + amount + 70);
    }
}
public class Bank {
    public static void main(String[] args) {
        try {
            Account account = new Account("Virti", 300);
            account.displayAccountDetails();
    
            SavingAccount savingAccount = new SavingAccount("Disha", 500);
            savingAccount.displayAccountDetails();
    
            CurrentAccount currentAccount = new CurrentAccount("Abc", 700);
            currentAccount.displayAccountDetails();
            account.setBalance(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
