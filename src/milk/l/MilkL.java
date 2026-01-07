
package milk.l;
import java.util.Scanner;

public class MilkL {

    
    public static void main(String[] args) {
        Scanner cow=new Scanner(System.in);
        System.out.print("Enter the total amount of milk produced in the morning (liters): ");
        double milkP = cow.nextDouble();
        final double CARTON = 3.78;
        final double COST_L = 0.38;
        final double PROFIT_C = 0.27;
        
        
        int cartonsNeed = (int) Math.ceil(milkP / CARTON);
        double pCost = milkP * COST_L;
        double total= cartonsNeed * PROFIT_C;
        
        
        System.out.println("\n= Milk Production Results =");
        System.out.printf("Milk produced: %.2f liters%n", milkP);
        System.out.printf("Number of cartons needed: %d cartons%n", cartonsNeed);
        System.out.printf("Cost of producing milk: $%.2f%n", pCost);
        System.out.printf("Profit from producing milk: $%.2f%n", total);


 
        
        
        
    }
    
}
