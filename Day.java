import java.util.Scanner;

class Day
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int n = sc.nextInt();

        if(n==1)
        {
            System.out.println("Sunday");
        }
        else if(n==2)
        {
            System.out.println("Monday");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}