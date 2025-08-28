// key-values pair
// null value are not allowed for only one time
// value size are infinite
// insertion and sorting is not possible
// its default capacity is 11
// if 75% capacity is filled then double capacity
// it is heterogeneous
import java.util.*;
public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        Hashtable ht2 = new Hashtable<>();
        System.out.println(ht1.size());
        System.out.println(ht1);
        ht1.put(1, "abc");
        ht1.put(2, "def");
        System.out.println(ht1);
        ht1.put(3, "gh");
        // ht2.put("def", 2);
        System.out.println(ht1);
        System.out.println(ht2);
        System.out.println(ht1.put(5, "de")); // returns null -> old value
        System.out.println(ht1);
        System.out.println(ht1.put(2, "gh")); // returns old value
        System.out.println(ht1);
        System.out.println(ht1.get(2));
        System.out.println(ht1.remove(2)); // true
        System.out.println(ht1);
        System.out.println(ht2);
        ht2.putAll(ht1);
        System.out.println(ht2);
       
        
    }
}

