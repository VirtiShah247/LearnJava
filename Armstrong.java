import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for(int i=1; i<=n ;i++)
        {
            int count = 0;
            int x = i;
            while(x!=0)
            {
                count++;
                x=x/10;
            }
            
            int old = i;
            int a = i;
            int sum = 0;
            int rem = 0;
            while(old!=0)
            {
                rem = old%10;
                sum += (int)Math.pow(rem, count);
                old = old/10;
            }
            if(a == sum)
            {
                System.out.println(sum);
            }
        }
        
    }
}
