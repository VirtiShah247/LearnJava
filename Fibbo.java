import java.util.*;
class Fibbo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0)
        {
            System.out.println("Enter valid number");
        }
        else
        {
            int x=0, y=1;
            int z=0;
            
            if(n > 2)
            {
                System.out.println(x+"\n"+y);
                for(int i=2; i<n; i++)
                {
                    
                    z = x + y;
                    System.out.println(z);
                    x = y;
                    y = z;
                }
            }
            else if(n == 1)
            {
                System.out.println(x);
            }
            else if(n == 2)
            {
                System.out.println(x+"\n"+y);
            }
        }
    }
}