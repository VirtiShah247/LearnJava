// WAP to illustrate inheritance with interface P extends by P1 and P2. Interface P12 inherits from 
// both P1 and P2. Each interface declares one stand alone different methods. Class Q implements P12.
// Initiate Q that invokes each method and each method displays its own constants.

interface P{
    int x = 10;
    void msg();
}
interface P1 extends P{
    int y = 20;
    void msg1();
}
interface P2 extends P{
    int z = 30;
    void msg2();
}
interface P12 extends P1, P2{
    int a = 40;
    void msg3();
}

class Q implements P12{
    public void msg(){
        System.out.println("x: " + x);
    }
    public void msg1(){
        System.out.println("y: " + y);
    }
    public void msg2(){
        System.out.println("z: " + z);
        
    }
    public void msg3(){
        System.out.println("a: " + a);
        
    }

}
public class Example1 {
    public static void main(String[] args) {
        Q q = new Q();
        q.msg();
        q.msg1();
        q.msg2();
        q.msg3();
    }
}
