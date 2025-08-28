import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String n = sc.next();        // use sc.nextLine() to take more than one word as input.

        System.out.println("Enter Mobile Number:");
        long mo = sc.nextLong();

        System.out.println("Enter Gender:");
        char g = sc.next().charAt(0);

        System.out.println("Name: "+n+"\nMobile Number: "+mo+"\nGender: "+g);
    }
}
/*
byte -> sc.nextByte()
short -> sc.nextShort()
same type of syntax for int,long,float,double,boolean
string -> sc.next() and sc.nextLine()
char -> sc.next().charAt(0)

Conditional Statements:
    -> In if else condition curly brackets are optional and without curly brackets we can take only one statement which should be not be declarative (int a=10).
    -> The ";" is a valid statement. E.g. if(true);
    */