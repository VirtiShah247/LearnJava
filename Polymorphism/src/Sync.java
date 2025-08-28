class BankAcc{
    int BankAmount = 50000;
    public void withdraw(int amount){
        synchronized(this){
        System.out.println("---withdraw--");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        if(BankAmount<amount){
            System.out.println("not enough money in bank" + BankAmount);
        }
        else{
            BankAmount-= amount;
            System.out.println("amount debited: " + amount);
            System.out.println("Bank amount: " + BankAmount);
        }}
    }
}
class SyncThread extends Thread{
    BankAcc b;
    int amount;
    public SyncThread(BankAcc b, int amount){
        this.b = b;
        this.amount= amount;
    }
    public void run(){
        b.withdraw(amount);
    }
}
public class Sync{
    public static void main(String[] args) throws InterruptedException {
        BankAcc b = new BankAcc();
        SyncThread s = new SyncThread(b, 30000);
        SyncThread s1 = new SyncThread(b, 40000);
        s.start();
        // s.join();
        s1.start();

    }
}
