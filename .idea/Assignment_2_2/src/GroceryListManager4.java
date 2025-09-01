import java.util.HashMap;
import java.util.Map;

public class GroceryListManager4 {

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

    // Update quantity of an existing item
    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.containsKey(item)) {
            groceryList.get(item).quantity = newQuantity;
            System.out.println("Quantity of " + item + " updated to " + newQuantity);
        } else {
            System.out.println(item + " is not in the grocery list.");
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

    public static void main(String[] args) {
        GroceryListManager4 manager = new GroceryListManager4();

        // Adding items
        manager.addItem("Apples", 2.5, "Fruits", 10);
        manager.addItem("Milk", 1.8, "Dairy", 5);
        manager.addItem("Bread", 2.0, "Bakery", 0);
        manager.addItem("Cheese", 3.0, "Dairy", 3);

        System.out.println();
        manager.displayList();

        System.out.println();
        manager.displayAvailableItems();

        System.out.println();
        manager.updateQuantity("Bread", 7);
        manager.updateQuantity("Banana", 4); // Non-existent item

        System.out.println();
        manager.displayAvailableItems();
    }
}
