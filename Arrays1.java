 class Arrays1 {
    public static void main(String[] args) {
        // int[] a;
        // a = new int[5];      
        // //System.out.println(a);      // The output is like [I@15db9742
        // System.out.println(a.getClass().getName());     // The output is [I

        // int[][] a;
        // a = new int[3][];
        // a[0] = new int[3];
        // a[1] = new int[2];
        // a[2] = new int[1];

        // System.out.println(a);
        // System.out.println(a[0]);
        // System.out.println(a[0][0]);

        int[][][] a;
        a = new int[2][][];
        a[0] = new int[3][];
        a[1] = new int[2][];
        a[0][0] = new int[2];
        a[0][1] = new int[3];
        a[0][2] = new int[1];
        a[1][0] = new int[1];
        a[1][1] = new int[2];

    }
}
/*
Array Declaration:
1. 1D Array:
    -> int[] a;
    -> int []a;
    -> int a[];

2. 2D Array:
    -> int[][] a;
    -> int [][]a;
    -> int[] []a;
    -> int[] a[];
    -> int a[][];

3. 3D Array:
    -> int[][][] a;
    -> int[] [][]a;
    -> int[][] a[];
    .....

-> If we want to specify dimension([]) before the variable it is possible only for first variable.
   E.g. int[] []a,b[];      // The output will be like a is 2D array and b is 3D array.
        int[] []a,[]b;      // The output will be compile error becuase there is dimension after 2nd variable.


Array Construction/Creation:
E.g. int[] a;
     a = new int[5];
     System.out.println(a[0]);      // The output will be 0 because the default value of int is 0.

-> At a time of array construction we should specify the size of array else we will get compile time error.
-> It is valid to have array having 0 size.
-> If we are specifying -ve array size we will get runtime(NegativeArraySizeException) error.
-> To specify size of array allowed datatypes are: byte, short, int, char.

 */