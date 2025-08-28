import java.util.*;

public class Krishnamurthy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int a = n;
        int sum = 0;
        while(n!=0)
        {
            int mul = 1;
            for(int i=1;i<=n%10;i++)
            {
                mul=mul*i;
            }
            sum+=mul;
            n=n/10;
        }
        if(a == sum)
        {
            System.out.println("It is a Krishnamurthy number");
        }
        else
        {
            System.out.println("It is not a Krishnamurthy number");
        }
    }
}
