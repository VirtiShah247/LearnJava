// insert elements in arraylist and only remove unique no from output
import java.util.*;
public class PriorityQueue2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(10,20,10,30,20,10,40,50));
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList());

       for (Integer i : al1) {
        if(Collections.frequency(al1,i)>=1 && !al2.contains(i)){
            System.out.println(i);
            al2.add(i);


        }
       }
       System.out.println(al1);
       System.out.println(al2);
    }
}
