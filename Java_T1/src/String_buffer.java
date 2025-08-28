import java.util.*;
public class String_buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a StringBuffer object
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");
        // Append strings to the StringBuffer
        sb1.append("Hello"); // string buffer is mutable


        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        sb1.append(" ");
        sb1.append("World!");

        // Print the contents of the StringBuffer
        System.out.println(sb1.toString());

        // Insert a string at a specific position

        // Print the modified contents of the StringBuffer
        System.out.println(sb1.toString());

        // Reverse the contents of the StringBuffer

        // Print the reversed contents of the StringBuffer
        System.out.println(sb1.toString());

        // to convert string to stringBuffer and vice versa.
        String s1 = new String("LJ");
        System.out.println(s1);
        s1.concat("Comp");
        System.out.println(s1);
        StringBuffer sb3 = new StringBuffer(s1);
        System.out.println(sb3);
        sb3.append("Comp");
        System.out.println(sb3);
        String s2 = sb3.toString();
        System.out.println(s2);
        System.out.println(sb3.length());
        System.out.println(sb3.charAt(2));
        sb3.setCharAt(2, 'c'); // application => calculator
        System.out.println(sb3);
        sb3.append(12);
        System.out.println(sb3);
        sb3.insert(5, "there");
        System.out.println(sb3);
        System.out.println(sb3.length());
        sb3.delete(2, 5); // 5 is not taken
        System.out.println(sb3);
        sb3.deleteCharAt(7);
        System.out.println(sb3);
        sb3.replace(2, 4, "hello");
        System.out.println(sb3);
        sb3.replace(0, 0, "abc");
        System.out.println(sb3);
        sb3.setLength(5);
        System.out.println(sb3);

        // wap to reverse a user defined string
        String s3 = sc.next();
        StringBuffer sb4 = new StringBuffer(s3);
        sb4.reverse();
        String s4 = sb4.toString();
        System.out.println(s4);

        StringBuffer sb5 = new StringBuffer("HI JAVA EXAM");
        StringBuffer sb6 = new StringBuffer(sb5.delete(3, 7));
        System.out.println(sb5.toString() + "//" + sb6.toString());


    }
}