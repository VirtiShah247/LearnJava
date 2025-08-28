import java.util.*;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        char ch = sc.next().charAt(0);
        String s2 = new String();
        int n = s1.length();
        for(int i=n-1; i>=0; i--){
            if(s1.charAt(i) != ch){
                s2 = s2 + s1.charAt(i);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
    

    
}
