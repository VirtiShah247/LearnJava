import java.util.*;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String str = sc.next();
        String rev = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
