import java.util.*;
class Run1{
    void area(float x1, float y1){
        float z1 = x1*y1;
        System.out.println(z1);
    }
    void area(double x){
        double z2 = 3.14*x*x;
        System.out.println(z2);
    }
    void area(double x2, double y2){
        double z3 = 0.5*x2*y2;
        System.out.println(z3);
    }
}
public class Area1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Run1 obj = new Run1();
        System.out.println("Enter 2 input: ");
        obj.area(sc.nextFloat(), sc.nextFloat());
        System.out.println("Enter 2 input: ");
        obj.area(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter 1 input: ");
        obj.area(sc.nextDouble());


    }
}
