import java.util.*;
public class PriorityQueue3 {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        // min-heap memeory
        // 1. top-to-bottom
        // 2. left-to-right
        // 3. ASCII value
        // 4. Parent smaller than child
        // 5. If first letter is not matched then it won't check further
        // 6. 
        pq1.add("Ant");
        pq1.add("Cat");
        pq1.add("dog");
        pq1.add("Croc");
        pq1.add("RUN");
        pq1.add("Bark");
        pq1.add("SIT");
        // pq1.add(null); // It is highest priority
        System.out.println(pq1);
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("JaVa");
        pq2.add("DBMS");
        pq2.add("se");
        pq2.add("dAa");
        pq2.add("Fee");
        pq2.add("PHy");
        pq2.add("MatHs");
        System.out.println(pq2);
        PriorityQueue<String> pq3 = new PriorityQueue<>();
        pq3.add("Cat");
        pq3.add("Cata");
        pq3.add("CAT");
        pq3.add("CATA");
        pq3.add("cata");
        pq3.add("cat");
        pq3.add("CA");
        System.out.println(pq3);
        PriorityQueue<String> pq4 = new PriorityQueue<>(Arrays.asList("Cat", "Cata", "CAT", "CATA", "cata", "cat", "CA"));
        System.out.println(pq4); // It is random-order





    
    }
}
