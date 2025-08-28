class Run2{
    int a= 10;
    // how to send obj in argument
    Run2 call(Run2 obj1){
        obj1.a = obj1.a + 5;
        return obj1;
    }
}
public class CallByReference {
    public static void main(String[] args) {
        Run2 obj = new Run2();
        Run2 obj2 = new Run2();
        System.out.println(obj.a + "before");
        obj2 = obj.call(obj);
        System.out.println(obj.a + "after");
        System.out.println(obj2.a + "after");

    }
}
