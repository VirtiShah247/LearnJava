import java.util.*;
import java.util.function.IntFunction;

public class Collection3 {
    public static void main(String[] args) {
        // default capacity is 10
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(20);
        al1.add(50);

        // In int array for remove it takes index, but for string it takes value, why?
        // Because, remove takes 2 types object or index
        // String usually takes object and int usually takes index

        // al1.remove(2);
        al1.remove(Integer.valueOf(20)); // For object this way it is used
        // alternative but it is not correct way because here we are already giving index here so no use
        al1.remove(al1.get(1)); 

        // It adds element at index 3 and move all elements down from that index
        // including element which was previously at this index
        al1.add(2, 100); 
        al1.set(3, 1000); // It replace element from this index with this value
        
        for(int i = 0; i<al1.size(); i++) {
            System.out.println(al1.get(i));
        }
        for(int element : al1) {
            System.out.println("Element - " + element);
        }
        System.out.println(Collections.frequency(al1,20));
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("compiler");
        al2.add("ljiet");
        al2.add("ai");
        System.out.println(al2);

        // al2.remove("ai");
        // System.out.println(al2); // ["compiler", "ljiet"]

        // al2.remove(0);
        // System.out.println(al2);  // ["ljiet"];

        var array1 = al1.toArray();
        System.out.println("Array - " + array1); // [Ljava.lang.Object;@e056f20

        var array2 = al1.toArray(new Integer[0]);
        System.out.println("Array 2 - " + array2); // [Ljava.lang.Integer;@41e36e46

        // This are 2 ways for comparing using natural order
        // sort method is doing the same thing which below line of code is doing al1.sort(null)
        Collections.sort(al1); 
        al1.sort(null);

        // Comparator is a functional interface
        // It has compare method which compares 2 objects of same type
        // It is used if we want unnatural order or custom order
        Collections.sort(al2,Comparator.comparing(String::length));
        System.out.println(al2);
        for (String string : al2) {
            System.out.println(string);
        }

        List<Integer> al3 = new ArrayList<>();
        al3.add(100);
        al3.add(0);
        al3.add(40);
        al3.add(20);
        al3.add(40);
        al3.add(25);

        // Comparator is function interface
        // It has to be implemented by some class so that's why a class is implementing it 
        // and it's object is used here
        al3.sort(new MyIntComparator());
        System.out.println("Sorted list using comparator class- " + al3);

        al3.sort((n1, n2) -> n1 - n2);
        System.out.println("Sorted list using lambda expression- " + al3);

        al2.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted string - " + al2);

        List<StudentComparator> students = new ArrayList<StudentComparator>();
        students.add(new StudentComparator(1, "Sahil", 95.5)); 
        students.add(new StudentComparator(3, "Ajay", 25.5)); 
        students.add(new StudentComparator(2, "Cat", 105.5)); 
        students.add(new StudentComparator(4, "Zedh", 35.5));
        
        System.out.println(students.toString());

        students.sort((s1, s2) -> {
            if(s2.getMarks() > s1.getMarks()) {
                return 1;
            }
            else if(s2.getMarks() < s1.getMarks()) {
                return -1;
            }
            return 0;
        });

        Comparator<StudentComparator> stu =  Comparator.comparing(StudentComparator::getMarks)
            .reversed()
            .thenComparing(StudentComparator::getName);

        students.sort(stu);
        System.out.println(students.toString());

        Collections.sort(students, stu);
        System.out.println(students.toString());

    }
}
