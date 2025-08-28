class Demo1{
    int i;
    static String s1 = "abc";
}
public class App {
    
    public static void main(String[] args) throws Exception {
        Demo1 obj1 = new Demo1(); 
        obj1.i = 9;
        System.out.println(obj1.i);
        System.out.println(Demo1.s1);
    }
}
