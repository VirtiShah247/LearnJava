// wap  that reads the list of names and cor phone no. create an obj in hash map that stores both the data. 
// The prog should prompt the user the name by entering ph no.
import java.util.*;
public class Hashmap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Long, String> hm1 = new HashMap<>();
        hm1.put(7896543219l, "abc");
        hm1.put(7896543218l, "def");
        hm1.put(7896543217l, "ghi");
        System.out.println(hm1);
        System.out.println("Enter phone no: ");
        Long ph = sc.nextLong();
        System.out.println(hm1.get(ph));

    }
}
