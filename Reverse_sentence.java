import java.util.*;

public class Reverse_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        String rev = "";

        for(int i=arr.length-1; i>=0; i--)
        {
            if(i==0)
            {
                rev += arr[i];
            }
            else
            {
                rev += arr[i] + " ";
            }
        }
        System.out.println(rev);
        StringBuffer rev_word = new StringBuffer(str).reverse();
        System.out.println(rev_word);


    }
}
