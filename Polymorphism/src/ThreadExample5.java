class Msg{
    public void withdraw(String name){
        synchronized(this){
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("name: "+ name + " good morning");
        this.notify();
        }
    }
}
class ThreadRun7 extends Thread{
    Msg b;
    String name;
    public ThreadRun7(Msg b, String name){
        this.b = b;
        this.name = name;
    }
    public void run(){
        b.withdraw(name);
    }
}
public class ThreadExample5{
    public static void main(String[] args) throws Exception {
        Msg b = new Msg();
        ThreadRun7 s = new ThreadRun7(b,"abc");
        ThreadRun7 s1 = new ThreadRun7(b,"def");
        s.start();
        s1.start();
        // s.join();
        synchronized(s){
            s.wait();
        }
        synchronized(s1){
            s1.wait();
        }

    }
}
