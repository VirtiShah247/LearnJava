// static is highest priotrize block
class StaticRun{
    static int counter; // problem was without static for every obj it initialises to zero and increment. So static is used
    StaticRun(){
        counter++;
        System.out.println(counter);
    }
}
public class Static {
    static {
        System.out.println("hiii123");
    }
    public static void main(String[] args) {
        System.out.println("hello");
        StaticRun obj = new StaticRun();
        StaticRun obj1 = new StaticRun();
    }
    static {
        System.out.println("hiii");
    }
}
