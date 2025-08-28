import java.util.*;
public class Array_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" numbers:");
        int[] a = new int[n];
        int temp;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(a[i]<a[j])
        //         {
        //             temp=a[i];
        //             a[i]=a[j];
        //             a[j]=temp;
        //         }
        //     }
        // }
        // System.out.println("Sorted array:");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(a[i]);
        // }
        Arrays.sort(a);
        System.out.println("Sorted array:");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
