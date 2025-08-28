interface I2{
    void msg2();
}
interface I3 extends I2{
    void msg2();
}
class InterfaceMain{
    public void msg2(){
        System.out.println("msg 2");
    }
}
class InterfaceMain1 extends InterfaceMain implements I3{
    public void msg2(){
        System.out.println("Interface main 1");
    }
}
// here I3 won't extends I2 before remove that before calling this class
// class InterfaceMain2 implements I2, I3{
//     public void msg2(){
//         System.out.println("interface main 2");
//     }
// }

// To call this remove extends from I2
interface I4 extends I2, I3{
    void msg2();
}
public class Interface1 {
    public static void main(String[] args) {
        // InterfaceMain im = new InterfaceMain();
        // im.msg2();
        InterfaceMain1 im1 = new InterfaceMain1();
        im1.msg2();
        // InterfaceMain2 im2 = new InterfaceMain2();
        // im2.msg2();
    }
}
