// hash set stores using hash method, no insertion method, no duplicates only unique values, and its default capacity is 16.
// 
import java.util.*;
public class Hash1 {
    Hash1(){
       
        
    }
    public static void main(String[] args) {
        // Hash1 h1 = new Hash1();
        HashSet hs1 = new HashSet<>();
        HashSet hs2 = new HashSet<>();
        HashSet hs3 = new HashSet<>();

        hs1.add(10);
        hs1.add(55);
        hs1.add(9);
        hs1.add(10.5);
        hs1.add(5);
        hs1.add(null);
        hs1.remove(55);
        System.out.println(hs1);
        System.out.println(hs1.isEmpty());
        hs2.addAll(hs1);
        hs1.addAll(hs1);
        System.out.println(hs2);
        System.out.println(hs1);
        hs1.add(555);
        hs1.add(20);
        // hs2.clear(); // []
        // System.out.println(hs2);
        hs1.removeAll(hs2); // []
        System.out.println(hs1);
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.equals(hs2));
        System.out.println();
        System.out.println(hs1.hashCode());
        System.out.println(hs2.hashCode());
        System.out.println(hs3.hashCode());
        Object obj = new Object();
        for (Object x : hs2) {
            System.out.println(x);
        }
        System.out.println("have fun!");
        Iterator i = hs1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }        
    }
}
