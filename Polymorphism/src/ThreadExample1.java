// ThreadRun1 extends Thread implements Runnable
class ThreadRun1 implements Runnable{
    public void run(){
        System.out.println("child");
    }
}
public class ThreadExample1 {
    public static void main(String[] args) {
        ThreadRun1 r = new ThreadRun1();
        Thread obj = new Thread(r);
        obj.start();
        System.out.println("Parent");
        // ANS: 
        // Parent
        // Child
    }
}
