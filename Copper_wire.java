import java.util.Scanner;

public class Copper_wire {
  public static void main(String[] args) {
    while (true) {
        System.out.println("||| ABC MANUFACTURING PVT LTD ||| ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Display types of wires\n2. Display copper purchase\n3. Total amount of copper purchase\n4. Display copper used in wires in kg\n5. Display copper amount of each order of wires and total copper order amount\n6. EXIT");
        int n = sc.nextInt();
        String[] wire_name = {"A","B","C"};
        double[] weight_bundle = {1.5,2,2.5};
        int[] copper_purchase = {1500,200,500};
        int[] copper_price = {10,15,12};
        int[] wire_order_bundle = {100,50,150};       
        switch (n) {
            case 1:
                System.out.println("Three types of wire along with its weigth per bundle.");
                for(int i=0;i<3;i++) {
                    System.out.println("Wire: "+wire_name[i]+" weight per bundle: "+weight_bundle[i]+"kg");
                }
                break;
            case 2:
                System.out.println("Copper purchase information: ");
                String[] date = {"1st November 2023","6th November 2023","11th November 2023"};
                for(int i=0;i<3;i++) {
                    System.out.println(copper_purchase[i]+"kg copper was purchased on dated "+date[i]+" at Rs "+copper_price[i]+" per Kg");
                }
                break;            
            case 3:
                System.out.println("Total amount of copper Purchase:");
                int total_copper_amount = 0;
                for(int i=0;i<3;i++) {
                    total_copper_amount += copper_purchase[i] * copper_price[i];
                }
                break;
            case 4:
                System.out.println("Copper used in wires in Kg.");
                for(int i=0;i<3;i++) {
                    System.out.println("In Wire "+wire_name[i]+" total copper used is "+(wire_order_bundle[i] * weight_bundle[i])+" Kg.");
                }
                break;           
            case 5:
                System.out.println("Copper amount of each order of wires and total copper order amount.");
                
                break;
        
            default:
                break;
        }
    }
      }   
}
