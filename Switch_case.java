import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
/*
Rules for Switch Case:
-> Allowed data types for switch case are byte, short, int, char.
-> Every case label should be within the range of switch argument.
-> Every case label should be valid compile time constant, if we are taking variable as a case label then it gives compile time error.
 E.g. (case x*2) is not allowed.
-> Expressions are allowed for both switch argument and case label, but case label should be constant argument.
-> Duplicate case labels are not allowed.
-> No errors due to semicolon at the end of the switch.
-> Variable declaration is allowed in switch block.
-> Curly brackets are mandatory for switch block, but in cases it is not mandatory.
-> Switch statements can be empty.
-> Default case can occur anywhere and also it is not mandatory to write in switch case.
 */
