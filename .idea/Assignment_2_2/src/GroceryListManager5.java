import java.util.HashMap;
import java.util.Map;

public class GroceryListManager5 {

    private static class Item {
        double cost;
        String category;
        int quantity;

        Item(double cost, String category, int quantity) {
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }
    }

    private HashMap<String, Item> groceryList = new HashMap<>();

    public void addItem(String item, double cost, String category, int quantity) {
        if (groceryList.containsKey(item)) {
            System.out.println(item + " is already in the grocery list.");
        } else {
            groceryList.put(item, new Item(cost, category, quantity));
            System.out.println(item + " has been added with cost $" + cost + ", category " + category + ", quantity " + quantity);
        }
    }

    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            groceryList.get(item).quantity = newQuantity;
            System.out.println("Quantity of " + item + " updated to " + newQuantity);
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    // Display all items
    public void displayList() {
        System.out.println("Grocery List:");
        int i = 0;
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            i++;
            System.out.println(i + ". " + entry.getKey() + " - $" + entry.getValue().cost + ", Category: " + entry.getValue().category + ", Quantity: " + entry.getValue().quantity);
        }
        if (i == 0) {
            System.out.println("The grocery list is empty.");
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        int count = 0;
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            if (entry.getValue().category.equalsIgnoreCase(category)) {
                count++;
                System.out.println(count + ". " + entry.getKey() + " - $" + entry.getValue().cost + ", Quantity: " + entry.getValue().quantity);
            }
        }
        if (count == 0) {
            System.out.println("No items found in this category.");
        }
    }

    // Display items with positive quantity
    public void displayAvailableItems() {
        System.out.println("Available Items:");
        int count = 0;
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            if (entry.getValue().quantity > 0) {
                count++;
                System.out.println(count + ". " + entry.getKey() + " - $" + entry.getValue().cost + ", Category: " + entry.getValue().category + ", Quantity: " + entry.getValue().quantity);
            }
        }
        if (count == 0) {
            System.out.println("No available items with positive quantity.");
        }
    }

    // Calculate total cost considering quantity
    public double calculateTotalCost() {
        double total = 0.0;
        for (Item item : groceryList.values()) {
            total += item.cost * item.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager5 manager = new GroceryListManager5();

        // Testing total cost calculation
        manager.addItem("Apples", 2.5, "Fruits", 4);
        manager.addItem("Milk", 1.8, "Dairy", 3);
        manager.addItem("Bread", 2.0, "Bakery", 2);

        System.out.println();
        manager.displayList();
        System.out.println("\nTotal cost: $" + manager.calculateTotalCost());

        // Testing category display
        System.out.println();
        manager.displayByCategory("Dairy");
        manager.displayByCategory("Fruits");
        manager.displayByCategory("Bakery");

        // Testing quantity tracking
        System.out.println();
        manager.displayAvailableItems();
        manager.updateQuantity("Milk", 0);
        manager.updateQuantity("Bread", 5);

        System.out.println();
        manager.displayAvailableItems();
        System.out.println("\nTotal cost after quantity update: $" + manager.calculateTotalCost());
    }
}
