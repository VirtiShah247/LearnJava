import java.util.*;

public class Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do
        {
            System.out.println("Enter IP address");
            String ip = sc.next();
            String[] arr = ip.split("\\.");
            int count = 0;
            if(arr.length == 4)
            {
                for(int i=0; i<arr.length-1; i++)
                {
                    int num = Integer.parseInt(arr[i]);
                    if(num>=0 && num<=255)
                    {
                        count+=1;
                        if(count == 3)
                        {
                            System.out.println("Valid IP address\n");
                            flag = false;
                            count = 0;
                        }
                    }
                    else
                    {
                        System.out.println("Invalid IP address\n");
                    }
                    
                }
                
                
            }
            else
            {
                System.out.println("Invalid IP address\n");
            }
        }while(flag);
        
    }
}
