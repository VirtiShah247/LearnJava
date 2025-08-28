// key-values pair
// null value are only allowed for only one time
// value size are infinite
// insertion and sorting is not possible
// its default capacity is 16
// if 75% capacity is filled then double capacity
// it is heterogeneous
import java.util.*;
public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>(16, 0.75f);
        hm1.put(1, "hii");
        hm1.put(1, "hii55");
        hm1.put(7, "hii");
        hm1.put(2, "hii1");
        hm1.put(3, "hii2");
        hm1.put(0, "hii3");
        hm1.put(null, null);
        hm1.put(5, null);
        hm1.put(null, null);
        System.out.println(hm1);
        System.out.println(hm1.get(1)); 
        System.out.println(hm1.remove(1));
        System.out.println(hm1.remove(1)); // null
        System.out.println(hm1.remove(2,"abc")); // false
        System.out.println(hm1.remove(2,"hii1")); // true
        System.out.println(hm1.containsKey(5)); // true
        System.out.println(hm1.containsValue(null)); // true
        System.out.println(hm1);
        Collection c = hm1.values();
        System.out.println(c);
        Collection c1 = hm1.keySet();
        System.out.println(c1);
        Set s = hm1.keySet();
        System.out.println(s);
    }
}
