import java.util.*;
public class Twodarray {
    public static void main(String_chap[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a[][] = new int[3][3];
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[i].length; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            boolean flag = true;
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[i].length; j++){
                    if(i == j && a[i][j] != 1){
                        flag = false;
                        break;
                    }
                    else if(i != j && a[i][j] != 0){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true){
                System.out.println("Identical array");
            }
            else{
                System.out.println("Not identical array");
            }
        }
        
        
        
    }
}
