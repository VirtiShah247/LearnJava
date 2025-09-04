class Counter {
    private int c = 0;
    public synchronized void incCount() {
        c++;
        System.out.println("Thread - " + Thread.currentThread().getName() +  " C - " + c);
    }
    public synchronized int getCount() {
        return c;
    }
}
public class SyncMethod {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i = 0; i<10; i++) {
                c.incCount();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                c.incCount();
            }
        });

        t1.start();
        t2.start();

        try {
            // t1.join();
            t2.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        System.out.println("Count = " + c.getCount());
    }
}
