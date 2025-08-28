// where x is km and y is m
import java.util.*;
class Km_mRun{
    double x;
    double y;
    void getData(double a, double b){
        x = a;
        y = b;
    }
    void sum(Km_mRun obj1, Km_mRun obj2){
        x = obj1.x + obj2.x;
        y = obj1.y + obj2.y;
        if(y>1000){
            x+= (int)y/1000;
            y = y%1000;
        }
    }
    void display(){
        System.out.println(x + "km");
        System.out.println(y + "m");
    }

}
public class Km_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Km_mRun obj1 = new Km_mRun();
        Km_mRun obj2 = new Km_mRun();
        Km_mRun obj3 = new Km_mRun();
        System.out.println("Enter km and m. Pls. enter meter below 1000");
        obj1.getData(sc.nextInt(), sc.nextInt());
        System.out.println("Enter km and m. Pls. enter meter below 1000");
        obj2.getData(sc.nextInt(), sc.nextInt());
        obj3.sum(obj1, obj2);
        obj3.display();
        // obj3.getData(sc.nextInt(), sc.nextInt());


    }
}
