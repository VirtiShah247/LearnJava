class ThreadRun3 extends Thread{
    static Thread obj;
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(10);
                obj.join(); // here obj = main thread
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                
            }
            System.out.println("child");
        }
    }
}
public class ThreadExample3 {
    public static void main(String[] args) throws InterruptedException {
        ThreadRun3.obj = Thread.currentThread();
        ThreadRun3 r3 = new ThreadRun3();
        r3.start(); // child thread begins
        // r3.join(0); // main thread waits until child finishes
        // first all child comes then parent because joins works after another. 
        // So since join is connected with r3 object so child comes first then parent.
        // join vs sleep child parent will work according to its sleep time and in join obj will come first.
        // Also join will ignore delay time who will come first it will use sleep time to only print but first child will only come.
        for(int i=0; i<5; i++){
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
                
            }
            System.out.println("parent");
        }
    }
}
