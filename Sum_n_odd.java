public class Sum_n_odd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum=0;
        for(int i=1;i<=2*n;i+=2)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}
