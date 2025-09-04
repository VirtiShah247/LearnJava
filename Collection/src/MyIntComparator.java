import java.util.Comparator;

public class MyIntComparator implements Comparator<Integer> {
    // compare methods return 3 int values
    // -1 ---> n1 will come first then n2
    // 0 ----> n2 and n1 have same value,so there order of execution is order after sort
    // 1 ----> n2 will come first then n1
    @Override
    public int compare(Integer n1, Integer n2) {
        return n2 - n1; // descending order
        // return n1 - n2; // ascending order
    }
}
// 3 5 --> 5 3 ===> 5 - 3 = 1, so n2 will come first then n1 ( n2 - n1 )
// 5 3 --> 5 3 ===> 3 - 5 = -1, so n1 i.e 5 will come first then n2 i.e 3 ( n2 - n1 )

// 5 3 --> 3 5 ===> 5 - 3 = 1, so n2 will come first then n1 ( n1 - n2 )
// 3 5 --> 3 5 ===> 3 - 5 = -1, so n1 will come first then n2 ( n1 - n2 )