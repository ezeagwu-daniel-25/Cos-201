import java.util.Scanner;

/**
 * COS 201 - Week 3 Practical
 * ItemCost: reads an item name, unit price and quantity, then
 * calculates and displays the total cost.
 *
 * Author: Ezeagwu Ugochukwu Daniel
 */
public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double totalCost = unitPrice * quantity;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item       : " + itemName);
        System.out.printf("Unit price : %.2f%n", unitPrice);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Total cost : %.2f%n", totalCost);

        input.close();
    }
}
