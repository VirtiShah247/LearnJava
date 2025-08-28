// wap that stimulates a queue at a coffee shop using arraydeque
// Add a customer to back of the queue
// remove the customer from first if he had been served
// view the current queue of the customer until you choose to quit

import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque ad1 = new ArrayDeque<>();
        while (true) {
            System.out.println("1. Add new customer\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int n = sc.nextInt();
                    ad1.addLast(n);
                    System.out.println(ad1);
                    break;
                case 2:
                    ad1.pollFirst();
                    System.out.println(ad1);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
        
    }
}

