import java.util.*;
public class Coffee_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coffee Menu:\n1.Espresso\n2.Cappuccino\n3.Latte");
        System.out.println("Enter your choice:");
        int n = sc.nextInt();
        if(n>=1 && n<=3)
        {
            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Thank you for selecting Espresso");
                    break;
                case 2:
                    System.out.println("Thank you for selecting Cappuccino");
                    break;
                case 3:
                    System.out.println("Thank you for selecting Latte");
                    break;
                default:
                    break;
            }
            System.out.println("Select the size of the drink (200ml or 400ml)");
            int size = sc.nextInt();
            if(size == 200 || size == 400)
            {
                System.out.println("Selected choice: "+((n==1)?("Espresso"):(n==2)?("Cappuccino"):("Latte")));
                System.out.println("Selected quantity: "+quantity);
                System.out.println("Selected size: "+size);
                int sum = 0;
                switch (n) {
                    case 1:
                        
                        if(size==200)
                        {
                            sum=100*quantity;
                        }
                        else
                        {
                            sum=200*quantity;
                        }
                        System.out.println("Your price: "+sum);
                        break;
                
                    case 2:
                        if(size==200)
                        {
                            sum=150*quantity;
                        }
                        else
                        {
                            sum=250*quantity;
                        }
                        System.out.println("Your price: "+sum);
                        break;

                    case 3:
                        if(size==200)
                        {
                            sum=200*quantity;
                        }
                        else
                        {
                            sum=300*quantity;
                        }
                        System.out.println("Your price: "+sum);
                        break;
                    
                    default:
                        break;
                }
                System.out.println("Thank you for visiting us!");
            }
            else
            {
                System.out.println("Only 200ml and 400ml are available");
            }
            
        }   
        else
        {
            System.out.println("Enter the choices from 1 to 3");
        }

    }
}
