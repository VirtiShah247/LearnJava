import java.util.*;

public class Array_print {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[] a;
        // a = new int[5];
        // for(int i=0; i<5; i++)
        // {
        //     a[i] = sc.nextInt();
        // }
        // System.out.println("The array is:");
        // for(int i=0; i<5; i++)
        // {
        //     System.out.println(a[i]);
        // }

        // Printing the array using for-each loop
        // for(int i:a)        // for(Datatype Element_name:Array_name)
        // {
        //     System.out.println(i);
        // }


        // Array Declaration, Creation and Initialization in Single line
        // int[] a = {10,20,30,40,50};
        // System.out.println(a);
        // System.out.println(a[1]);

        int[][] a = {{10,20},{30},{40,50}};
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.println(a[i][j]);
            }
        }

        // for(int[] arr:a)
        // {
        //     for(int ele:arr)
        //     {
        //         System.out.println(ele);
        //     }
        // }

        int[][][] arr = {{{10},{20,30},{40}},{{50,60},{70}}};
    }
}
