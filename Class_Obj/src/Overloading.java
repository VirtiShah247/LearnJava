import java.util.*;
class Run{
    void sum(){
        System.out.println("Ans");
    }
    void sum(int i){
        System.out.println("Int: " + i);
    }
    void sum(int ...i){
        System.out.println(i);
    }
    void sum(double d){
        System.out.println("Double: " + d);
    }
    // void sum(double d, int c){
    //     System.out.println(d + " " + c);
    // }
    void sum(Run o){
        System.out.println("Object");
    }
    void sum(String s){
        System.out.println("String: " + s);
    }
    void sum(StringBuffer sb){
        System.out.println("String Buffer: " + sb);
    }
    void sum(int a, float b){
        System.out.println("1");
    }
    void sum(float a, int b){
        System.out.println("2");
    }
}
public class Overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Run obj = new Run();
        // since double space is highest so to avoid space complexity we don't give double argument . this is where method overloading comes.
        // obj -> double -> float -> int -> char ====> top-to-down
        // Case 1
        obj.sum();
        obj.sum(10.5);
        obj.sum(10f);  // float will find if there is up conversion then it will call that function but if down conversion like int is there then it will give compile error.
        obj.sum('a'); 
        // Case 2
        obj.sum(new Run());
        obj.sum(sc.nextInt()); // we are passing the object in parameter
        // obj.sum(sc.nextDouble(), 5); // we are passing the object in parameter

        // Case 3 -> String and String Buffer
        obj.sum("Hi");
        obj.sum(new StringBuffer("hello")); // we are passing the object in parameter

        // obj.sum(10, 5); // ambiguous error ==> because both int and float can run this
        // obj.sum(10f, 5f); 
        // obj.sum(10, 10); // ambiguous error ==> because both int and float can run this
        obj.sum(5,6,7);
    }
}
