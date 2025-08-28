// In interface when you write the method, it adds public abstract.
// Interface fields get along with public static final.
// Interface cannot have body of method just like abstract
// Object creation is forbidden in intrface and implements class

// Rules:
// In inteface you cannot make constructor because we have written public static final.
// In interfae you cannot make static block.

// Default method and private method
//public static final
interface I1 {
    int x = 10;
    void msg();
    private void msg1(){
        System.out.println("private method");
    }
    default void msg2(){
        System.out.println("default method");
        msg1();
    }
    
}
class Main implements I1{
    public void msg(){
        System.out.println("Main class");
    }
    // private void msg12(){
    //     System.out.println("private method");
    // }
}
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Main m = new Main();
        I1 i1 = new Main();
        m.msg();
        // m.msg1(); ===> Private method ERROR
        m.msg2();
        i1.msg();
        // i1.msg1();

    }
}
