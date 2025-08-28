import java.util.*;

public class Collection3 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(20);
        al1.add(50);
        System.out.println(Collections.frequency(al1,20));
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("compiler");
        al2.add("ljiet");
        al2.add("ai");
        System.out.println(al2);
        Collections.sort(al2,Comparator.comparing(String::length));
        System.out.println(al2);
        for (String string : al2) {
            System.out.println(string);
        }
        


    }
}
