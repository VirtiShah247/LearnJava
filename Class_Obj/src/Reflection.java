import java.lang.reflect.Field;
import java.lang.reflect.Method;
// Account
class Account {
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }
    private long accountNumber;
    private String holderName;
    private double balance;
    Account() {
        System.out.println("default constructor called");
    }
    Account(long accountNumeber, String holderName, double balance) {
        this();
        this.accountNumber = accountNumeber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    private double getBalance() {
        return balance;
    }
    public String getHolderName() {
        return holderName;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    private void setBalance(double balance) {
        this.balance = balance;
    }
    private static void thisIsStaticMethod() {
        System.out.println("This is a private static method");
    }
    @Override
    public String toString() {
        return "Account number: " + this.accountNumber + "\nHolder name: " + this.holderName + "\nBalance: " + this.balance;
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception{
        Account account = new Account(123, "Virti Shah", 300);
        //  account.getClass() is like asking the object:
        // "Hey, which blueprint (class) were you created from?"
        // And the answer is: "I was created from the Account class.""
        System.out.println("\n" + account.getClass());
        Field[] accountList = account.getClass().getDeclaredFields();
        for (Field field : accountList) {
            System.out.println("Field: " + field.getName());
            if(field.getName().equals("accountNumber"))
            {
                // This is done to change value of private fields
                field.setAccessible(true);
                field.set(account, 1234);
            }
        }
        System.out.println("AccountNumber: " + account.getAccountNumber());

        Method[] methodList = account.getClass().getDeclaredMethods();
        for(Method method : methodList) {
            method.setAccessible(true);
            if(method.getName().equals("getAccountNumber"))
            {
                long accountNumber = (long)method.invoke(account);
                System.out.println("get Account number: " + accountNumber);
            }
            else if(method.getName().equals("setAccountNumber"))
            {
                method.invoke(account, 12345);
                System.out.println("set Account number: " + account.getAccountNumber());
            }
            else if(method.getName().equals("getBalance"))
            {   
                // method.setAccessible(true);
                double balance = (double)method.invoke(account);
                System.out.println("get Balance: " + balance);
            }
            else if(method.getName().equals("setBalance"))
            {  
                // method.setAccessible(true);
                method.invoke(account, 200);
                System.out.println(account.toString());
            }
            else if(method.getName().equals("thisIsStaticMethod")) {
                // Since it's a static method which is not associated with any object, so in object given null
                method.invoke(null);
            }
        }

    }
}
