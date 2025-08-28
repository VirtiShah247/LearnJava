import java.util.Scanner;

public class Array_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter index:");
        int index = sc.nextInt();
        
        int[] b=new int[n-1];
        for(int i=0;i<index;i++)
        {
            b[i]=a[i];
        }
        if(index < n)
        {
            for(int i=index;i<n-1;i++)
            {
                b[i]=a[i+1];
            }
        }
        
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
            System.out.println(b[i]);
        }
    }
}
