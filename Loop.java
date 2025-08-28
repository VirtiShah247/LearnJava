public class Loop {
    public static void main(String[] args) {
        // int i=1;
        // while(i<=10)
        // {
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("bye");
        
        // for(int i=0;i<5;i++)
        // {
        //     System.out.println(i);
        // }
        
    }
}
/*
Rules for While loop:
-> The arguments of while statment should be boolean type. if we are using any other type we will get compile time error.
-> Curly brackets are optional and without curly brackets only one statement is considered inside the loop which should be not 
be declarative statment.
-> If any operation involves any constant then compiler is responsible to perform that opeartion.
-> If any operation involves atleast one variable compiler won't perform that opeartion, at run time JVM will perform that operation.
-> Every final variable will be replaced with the corresponding value by compiler. 


Rules for For loop:
-> Initialization section:
    -> It will be executed only one time.
    -> In this we can declare multiple variables, but it should be of same type and we can't declare different variables.
    -> In this we can take any valid Java statement including sout.

-> Condition section:
    -> We can take any expression but it should return boolean.
    -> It is optional, if we are not taking any expressions compiler will place true.

-> Increment/Decrement section:
    -> In this we can take any valid Java statement including sout.
    
*/  
