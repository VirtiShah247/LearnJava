// to perform multiple task or method with single thread
// single thread cannot call multiple functions
// multiple thread can call single, multiple function
// if equal priorities then jvm will decide which to call. So it will be random 
// Thread constructors
class ThreadRun2 extends Thread{
    public void run(){
        // for (int i = 0; i < 15; i++) {
        //     System.out.println("thread");
        // }
        System.out.println(Thread.currentThread().isAlive());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread());

        System.out.println("child");

    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        // Thread t = new Thread();
        // Thread t1 = new Thread();
        // Thread t2 = new Thread();
        // Thread t3 = new Thread();
        System.out.println(Thread.currentThread().isAlive()); // Thread[#, currentThread, priority, where it is call from]
        ThreadRun2 r2 = new ThreadRun2();
        r2.start();
        System.out.println(r2.isAlive()); // false if called r2.run(); and true if called r2.start();
        System.out.println(r2.getName());// Thread-0
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("current main");
        System.out.println(Thread.currentThread());
        System.out.println("parent");
        // multiple thread calling same function
        ThreadRun2 r3 = new ThreadRun2();
        r3.start();
        System.out.println(Thread.MIN_PRIORITY); // 1
        System.out.println(Thread.MAX_PRIORITY); // 10
        Thread.currentThread().setPriority(9); // between 1 and 10
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread());
        // for(int i=0; i<15; i++){
        //     System.out.println("main thread");
        // }

    }
}
