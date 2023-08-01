
public class TipHelper {

/* Hi! I'm Minkun. I'm majoring in biomedical engineering and planning to do a cs minor! */

    public static void main(String[] args) { 

        double tipPercentage = 0.15;
        
        double mealTotal = 20.17;

        int numberItemsOrdered = 3;

        String customerName = new String("Jacob");

        double totalTip = tipPercentage * mealTotal;

        double totalAmountPaid = totalTip + mealTotal;

        System.out.printf("The total tip was $%.2f!\n", totalTip);
        
        System.out.printf(customerName + " owes a total of $%.2f.\n", totalAmountPaid);

    } 

}