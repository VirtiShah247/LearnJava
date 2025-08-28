// Name of error
// Description of error
// Status line or simple line of error
// Exception handling checks if method have exception, if not then give exception at method
public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        try {
            int b= 0;
            System.out.println(a/b);
        } 
        // catch (Exception e) {
        //     System.out.println("Error: " + e); 
        //     System.out.println();// java.lang.ArithmeticException: / by zero
            
        //     System.out.println();
        //     e.printStackTrace(); // java.lang.ArithmeticException: / by zero
        //     // at ExceptionHandling.main(ExceptionHandling.java:10)
        //     System.out.println(e);// java.lang.ArithmeticException: / by zero
        //     System.out.println(e.getMessage());//  / by zero
        // }
        // catch(ArithmeticException e){
        //     System.out.println("write non zero value " + e);
        // }
        catch(Exception e){
            System.out.println(e);
            // System.exit(0);

            return;
        }
        finally{
            System.out.println("finally");
        }
     
    }
}
