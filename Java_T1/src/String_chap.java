import java.util.*;

public class String_chap {
    public static void main(String[] args) {
        String s1 = new String("Comp");
        String s2 = "IT";
        String s3 = new String("compc");
        String s4 = "IT";
        String s5 = "";
        String s6 = "   Ah me    ";
        String s7 = "hello how are you";
        String []s8 = s7.split(" ");
        String []s9 = s7.split(" ",2);
        String s10 = "";
        String s11 = "";

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        // System.out.println(s1);
        System.out.println(s2 == s4);
        // System.out.println(s2);
        s1.concat("def"); // s1 gives comp becoz s1 is not reassign
        s1= s1.concat("Abc");
        System.out.println(s1);
        System.out.println(s1.concat("abc"));
        System.out.println("S1 " + s1);
        System.out.println(s1.charAt(3));
        System.out.println(s5.isEmpty());
        System.out.println(s1.length());
        System.out.println(s3.replace('c', 'z'));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0, 5));
        System.out.println(s1.indexOf("A")); //if didn't find then returns -1
        System.out.println(s1);
        System.out.println(s1.lastIndexOf("c")); //if didn't find then returns -1
        System.out.println(s6.trim());
        
        for(String v: s8){
            System.out.println(v);
        }
        System.out.println("///");
        for(String v: s9){
            System.out.println(v);
        } 
        System.out.println(s11.compareTo(s10)); //it always hit first 
        //world.compareTo(worldAwesome) => length of the string of Awesome as worldAwesome is in method otherwise -length of Awesome
        //world.compareTo(worlDAwesome) => 32
        //world.compareTo(world) => 0
        //"".compareTo("") => 0
        // System.out.println(s1.concat(s2));


        char ch[] = {'J', 'a', 'v', 'a'};
        String s12 = "Java";
        String s13 = new String();
        for(int i=0; i<ch.length; i++){
            s13 = s13 + ch[i];
        }
        System.out.println(s12 == s13); //false
        System.out.println(s12.equals(s13)); //true

        // string buffer is mutable it is used when we want wants to keep data dynamic
    }
}
