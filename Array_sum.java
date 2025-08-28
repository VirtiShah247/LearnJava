import java.util.*;

public class Array_sum {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++)
        {
            a[i] = sc.nextInt();
        }
        int sum=0,min=a[0],max=a[0];
        for(int i=0; i<10; i++)
        {
            if(a[i] > max)
            {
                max=a[i];
            }
            if(a[i] < min)
            {
                min=a[i]; 
            }
            sum+=a[i];
        }
        float avg = (sum/10f);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }
}
