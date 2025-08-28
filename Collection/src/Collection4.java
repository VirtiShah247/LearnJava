// create  a list of 5 machines with price 10000.0, 55000.0, 80000.0, 25000.0, 55000.0
// find out of the maximum out of it.
// sort the list
import java.util.*;
public class Collection4 {
    public static void main(String[] args) {
        ArrayList<Double> al1 = new ArrayList<>(Arrays.asList(10000.0, 55000.0, 80000.0, 25000.0, 55000.0));
        System.out.println(Collections.max(al1));
        Collections.sort(al1, Comparator.naturalOrder());
        System.out.println(al1);
    }
}
