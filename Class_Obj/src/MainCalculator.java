import java.util.*;
class Calc{
    Scanner sc = new Scanner(System.in);
    void add(){
        System.out.println("Enter for add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }
    void mul(int a, int b){
        int mulAns = a*b;
        System.out.println(mulAns);
    }
    int sub(){
        System.out.println("Enter for sub: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a-b;
        return ans;
    }
    double div(double a, double b){
        double ans = a/b;
        return ans;
    }
}
public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc obj = new Calc();
        System.out.println("1. Add\n2. Mul\n3. Sub\n4. Div\n5. Exit\n");
        int choice = sc.nextInt();
        do {
            
            switch (choice) {
                case 1:
                    obj.add();
                    break;
                case 2:
                    System.out.println("Enter for mul: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    obj.mul(a,b);
                    break;
                case 3:
                    int subAns = obj.sub();
                    System.out.println(subAns);
                    break;
                case 4:
                    System.out.println("Enter for div: ");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    double divAns = obj.div(c,d);
                    System.out.println(divAns);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pls. enter correct choice");
                    break;
            }
            System.out.println("1. Add \n 2. Mul \n 3. Sub \n 4. Div \n 5. Exit \n");
            choice = sc.nextInt();
        } while (choice!=5);    
    }
}
