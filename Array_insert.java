import java.util.Scanner;

public class Array_insert {
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
        System.out.println("Enter value:");
        int value = sc.nextInt();

        int[] b=new int[n+1];
            for(int j=0;j<index;j++)
            {
                b[j]=a[j];
            }
        if(index<n)
        {
            for(int i=index+1;i<n+1;i++)
            {
                b[i]=a[i-1];
            }
            b[index]=value;
        }
        else
        {
            b[index]=value;
        }
        System.out.println();
        for(int i=0;i<n+1;i++)
        {
            System.out.println(b[i]);
        }
    }
}
