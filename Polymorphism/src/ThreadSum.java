class ThreadRun6 extends Thread {
    int sum = 0;

    public void run() {
        synchronized(this){
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            this.notify();
        }
        
    }
}

public class ThreadSum {
    public static void main(String[] args) throws Exception {
        ThreadRun6 r6 = new ThreadRun6();
        r6.start();
        // r6.join();
        synchronized(r6){
        r6.wait();    
        }
        System.out.println(r6.sum);
    }
}

// 

