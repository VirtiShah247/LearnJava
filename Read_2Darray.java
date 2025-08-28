import java.util.*;

public class Read_2Darray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the rows:");
        // int r = sc.nextInt();
        // System.out.println("Enter the columns:");
        // int c = sc.nextInt();
        // int[][] a=new int[r][c];
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        // System.out.println("Displaying the 2D array:");
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the r1:");
        // int r1 = sc.nextInt();
        // System.out.println("Enter the c2:");
        // int c1 = sc.nextInt();
        // System.out.println("Enter the r1:");
        // int r2 = sc.nextInt();
        // System.out.println("Enter the c2:");
        // int c2 = sc.nextInt();

        // if(r1==r2 && c1==c2)
        // {
        //     int[][] a=new int[r1][c1];
        //     int[][] b=new int[r2][c2];
        //     for(int i=0;i<r1;i++)
        //     {
        //         for(int j=0;j<c1;j++)
        //         {
        //             a[i][j]=sc.nextInt();
        //         }
        //     }
        //     for(int i=0;i<r2;i++)
        //     {
        //         for(int j=0;j<c2;j++)
        //         {
        //             b[i][j]=sc.nextInt();
        //         }
        //     }
        //     for(int i=0;i<r1;i++)
        //     {
        //         for(int j=0;j<c1;j++)
        //         {
        //             a[i][j]=a[i][j]+b[i][j];
        //         }
        //     }
        //     for(int i=0;i<r1;i++)
        //     {
        //         for(int j=0;j<c1;j++)
        //         {
        //             System.out.print(a[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        // }


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the r1:");
        // int r1 = sc.nextInt();
        // System.out.println("Enter the c2:");
        // int c1 = sc.nextInt();
        // System.out.println("Enter the r1:");
        // int r2 = sc.nextInt();
        // System.out.println("Enter the c2:");
        // int c2 = sc.nextInt();

        // if(r2==c1)
        // {
        //     int[][] a=new int[r1][c1];
        //     int[][] b=new int[r2][c2];
        //     for(int i=0;i<r1;i++)
        //     {
        //         for(int j=0;j<c1;j++)
        //         {
        //             a[i][j]=sc.nextInt();
        //         }
        //     }
        //     for(int i=0;i<r2;i++)
        //     {
        //         for(int j=0;j<c2;j++)
        //         {
        //             b[i][j]=sc.nextInt();
        //         }
        //     }
        //     int[][] m = new int[r1][c2];
        //     for(int i=0; i<r1; i++)
        //     {
        //         for(int j=0; j<c2; j++)
        //         {
        //             for(int k=0; k<c1; k++)
        //             {
        //                 m[i][j] += a[i][k] * b[k][j];
        //             }
        //         }
        //     }
        //     for(int i=0; i<r1; i++)
        //     {
        //         for(int j=0; j<c2; j++)
        //         {
        //             System.out.print(m[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        // }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r1:");
        int r1 = sc.nextInt();
        System.out.println("Enter the c2:");
        int c1 = sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] m=new int[c1][r1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<c1;i++)
        {
            for(int j=0;j<r1;j++)
            {
                m[i][j]=a[j][i];
            }
        } 
        for(int i=0; i<c1; i++)
            {
                for(int j=0; j<r1; j++)
                {
                    System.out.print(m[i][j]+" ");
                }
                System.out.println();
            }

    }
}
