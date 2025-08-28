class RunExample{
    int no;
    RunExample f2;
    RunExample(RunExample f){
        // no = 20;
        System.out.println("no "+ no);
    }
    RunExample(){
        no = 30;
        System.out.println(this);
        f2 = new RunExample(this);
        System.out.println(f2);
    }
    void get(){
        System.out.println("no: " + no);
    }
}
public class Example1 {
    public static void main(String[] args) {
        RunExample obj1 =  new RunExample();
        obj1.get();
    }
}
