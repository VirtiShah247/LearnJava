// Queue --> Priority queue ---> Dequeue
// 1. It allows duplicate values
// 2. It doesn't follow user given order
// 3. it won't allow heterogeneous elements
import java.util.*; 
public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue pq2 = new PriorityQueue<>();
        PriorityQueue pq3 = new PriorityQueue();
        PriorityQueue pq4 = new PriorityQueue(5);
        PriorityQueue pq7 = new PriorityQueue(pq1);

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(20);
        al1.add(50);
        PriorityQueue pq5 = new PriorityQueue(al1);
        System.out.println(pq5);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("compiler");
        al2.add("ljiet");
        al2.add("ai");
        // PriorityQueue<Integer> pq6 = new PriorityQueue<>(al2); // It is not allowing heterogeneous as String is added but type is Integer
        PriorityQueue<String> pq6 = new PriorityQueue<>(al2);
        System.out.println(pq6);
        

        // add() // returns exception error if not happens
        // offer() // if not happen then it returns false. It is add() exception handler
        
        // element()
        // peek() It is element() exception handler
        
        // remove()
        // pull() It is remove() exception handler

        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.offer(40);
        // pq1.offer(null); // run-time exception NullPointerException
        pq1.offer(10); // run-time exception NullPointerException
        System.out.println(pq1); // It is a min-heap memory
        // Rules for min-heap(Integer):
        // 1. written and see as top-to-bottom 
        // 2. written and see as left-to-right
        // 3. parent would be smaller than or equal to child
        // 4. single parent can have max 2 child class min 0 child class

        pq2.offer(60);
        pq2.offer(20);
        pq2.offer(40);
        pq2.offer(20);
        pq2.offer(5);
        pq2.offer(30);
        pq2.offer(50);
        pq2.offer(15);
        System.out.println(pq2);

        System.out.println(pq2.element());
        System.out.println(pq2.peek());
        System.out.println(pq2);
        System.out.println(pq2.poll());  
        System.out.println(pq2);
        System.out.println(pq2.remove());      
        System.out.println(pq2);


        //System.out.println(pq2);



        

    }
}
