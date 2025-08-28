import java.util.*;

public class Count_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        System.out.println("Enter your choice\n1.No of words\n2.No of Characters\n3.No of vowels\n4.Remove character of your choice");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                int no_words = 0;
                no_words = str.split("\\s+").length;
                System.out.println(no_words);
                break;
        
            case 2:
                int no_char = 0;
                for(int i=0;i<str.length(); i++)
                {
                    if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
                    {
                        no_char += 1;
                    }
                }
                System.out.println(no_char);
                break;

            case 3:
                int no_vowels = 0;
                for(int i=0;i<str.length(); i++)
                {
                    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
                    {
                        no_vowels += 1;
                    }
                }
                System.out.println(no_vowels);
                break;

            case 4:
                System.out.println("Enter a character");
                String ch = sc.next();
                String new_str = str.replace(ch,"");
                System.out.println("New string:\n"+new_str);
                System.out.println("No of replaced letters:\n"+(str.length()-new_str.length()));
                break;

            default:
                break;
        }

    }
}
