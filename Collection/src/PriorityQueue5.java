// wap to create an array to store an list of students and prog should faciliate.
//  Method add a student, remove, and sort by name
import java.util.*;
public class PriorityQueue5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> al2 = new ArrayList<>(Arrays.asList("virti","modu","shlokBoii"));
        
        System.out.println("Choice: ");
        int c=sc.nextInt();
        switch(c){
            case 1:
                adds(al2);
                break;

            case 2:
                removes();
                break;

            case 3:
                sorts();
                break;
            default:
                break;
        }


        
    }
    public static void adds(ArrayList al2){
    Scanner sc=new Scanner(System.in);
        // al2.offer(sc.nextLine());
    }
    public static void removes(){

    }
    public static void sorts(){

    }
}
