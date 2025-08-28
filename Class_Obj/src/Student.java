// create student with roll no, name and phone no. use a necessary method to initialize and print it. Create same for atleast 5 student. Take no from user.
import java.util.*;
class Details{
    int rollNo;
    String name;
    long phoneNumber;
    void getRollNo(int roll){
        rollNo = roll;
    }
    void getName(String n){
        name = n;
    }
    void getPhoneNumber(long phNo){
        phoneNumber = phNo;
    }
    void displayDetails(){
        System.out.println("Roll no: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

}
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Details[] a = new Details[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Details();
            System.out.println("Enter Name: ");
            a[i].getName(sc.next());
            sc.nextLine();
            System.out.println("Enter Roll no: ");
            a[i].getRollNo(sc.nextInt());
            System.out.println("Enter phone number: ");
            a[i].getPhoneNumber(sc.nextLong());
        }
        for (int i = 0; i < a.length; i++) {
            a[i].displayDetails();
        }
    }
}
