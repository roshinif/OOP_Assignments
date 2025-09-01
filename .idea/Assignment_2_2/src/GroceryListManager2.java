import java.util.HashMap;
import java.util.Map;

public class GroceryListManager2 {

    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add an item with its cost
    public void addItem(String item, double cost) {
        if (groceryList.containsKey(item)) {
            System.out.println(item + " is already in the grocery list.");
        } else {
            groceryList.put(item, cost);
            System.out.println(item + " has been added with a cost of $" + cost);
        }
    }

    // Remove an item
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    // Display all items with their costs
    public void displayList() {
        System.out.println("Grocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            int i = 1;
            for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
                System.out.println(i + ". " + entry.getKey() + " - $" + entry.getValue());
                i++;
            }
        }
    }

    // Check if an item is in the list
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Calculate the total cost of all items
    public double calculateTotalCost() {
        double total = 0.0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager2 manager = new GroceryListManager2();

        // Adding items
        manager.addItem("Apples", 2.5);
        manager.addItem("Milk", 1.8);
        manager.addItem("Bread", 2.0);
        manager.addItem("Milk", 1.8); // Duplicate

        // Displaying the list
        System.out.println();
        manager.displayList();

        // Checking an item
        System.out.println("\nIs \"Milk\" in the grocery list? " + manager.checkItem("Milk"));

        // Calculating total cost
        System.out.println("\nTotal cost: $" + manager.calculateTotalCost());

        // Removing an item
        System.out.println("\nRemoving \"Milk\" from the list...");
        manager.removeItem("Milk");
        manager.removeItem("Cheese"); // Non-existent

        // Displaying updated list and total cost
        System.out.println();
        manager.displayList();
        System.out.println("\nTotal cost after removal: $" + manager.calculateTotalCost());
    }
}
