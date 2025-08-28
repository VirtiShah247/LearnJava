// this to call current class method
// this to call a current class constructor
// passing of arguments ==> passing of object

class ThisRun{
    int id;
    // ThisRun(){
    //     this.ThisRun(1);
    // }
    ThisRun(int id){
        this.id = id; // due to this warning we will use this keyword as compiler doesn't understand difference
        System.out.println(id);
    }
    
    void set(int a){
        id = a;
    }
    void print(){
        this.display(); 
    }
    void display(){
        System.out.println(id);
    }
}
public class ThisKeyword{
public static void main(String[] args) {
    ThisRun obj = new ThisRun(5);
    ThisRun obj1 = new ThisRun(5);
    // ThisRun obj2 = new ThisRun();
    System.out.println(obj.id);
    obj1.set(10);
    obj.print();
}}