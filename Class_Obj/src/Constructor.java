// IT should have same name as class
// It doesn't have return type
// Access modifier: public, private, protected and default
// When developer doesn't create constructor then compiler (not JVM) will create a default constructor without argument.
// Constructor doesn't return type as it is no return type
//  but it returns value so when we sout obj1.x it gives value passed to argument.
// if we have created a constructor then compiler won't create default constructor.
//  So to solve that error we can give void return type to the function so default constructor will form

// WAP to copy the values with constructors5
class ConstructorRun{
    int x;
    ConstructorRun(){
        System.out.println("Constructor");
    }
    // Example of constructor method overloading and a normal function with same Constructor name can be created
    ConstructorRun(int a){
        System.out.println(a);
        x = a;
    }
    ConstructorRun(ConstructorRun obj){
        x = obj.x;
        System.out.println("x: "+x);
    }
}
public class Constructor {
    public static void main(String[] args) {
        // ConstructorRun obj = new ConstructorRun();
        ConstructorRun obj1 = new ConstructorRun();
        System.out.println(obj1.x); // ans: 5 ==> constructor returns value not type
        ConstructorRun obj3 = new ConstructorRun(obj1);

    }
}
