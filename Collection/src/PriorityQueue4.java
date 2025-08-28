import java.util.*;
public class PriorityQueue4 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(20);
        al1.add(50); 
        ArrayList al2 = new ArrayList<>(Arrays.asList(10,20,10,30,20,10,40,50));
        al2.add(10);
        al2.add("hii");
        System.out.println(al2);
        ArrayDeque dq1=new ArrayDeque<>(al2);
        ArrayDeque dq2=new ArrayDeque<>(dq1);
        System.out.println(dq1);
        System.out.println(dq2);
        // PriorityQueue<Integer> pq4 = new PriorityQueue<>(al2);
        // System.out.println(pq4); // Exception error
        dq1.addFirst(2);
        dq1.addLast(1);
        System.out.println(dq1);
        dq2.clear();
        System.out.println(dq2);
        System.out.println(dq1.getFirst());
        System.out.println(dq1.getLast());
        dq1.offerFirst(20.5);
        dq1.offerLast(10.5);
        System.out.println(dq1);
        // System.out.println(dq1.peek());
        // System.out.println(dq1.peekFirst());
        // System.out.println(dq1.peekLast());
        // System.out.println(dq1);
        System.out.println(dq1.remove(1000));
        System.out.println(dq1);
        System.out.println(dq1.poll());
        System.out.println(dq1);
        System.out.println(dq1.removeFirst());
        System.out.println(dq1);
        System.out.println(dq1.removeLast());
        System.out.println(dq1);
        System.out.println(dq1.pollFirst());
        System.out.println(dq1);
        System.out.println(dq1.pollLast());
        System.out.println(dq1);
        PriorityQueue<Integer> pq4 = new PriorityQueue<>();
        System.out.println(pq4.peek()); // returns null
        // System.out.println(pq4.element()); // exception NoSuchElementException
        System.out.println(pq4.poll());// returns null
        // System.out.println(pq4.remove());// exception NoSuchElementException
        System.out.println(dq1.size());
        System.out.println(dq1.element());


    }
}
