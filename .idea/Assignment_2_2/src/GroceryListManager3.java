import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryListManager3 {

    private static class Item {
        double cost;
        String category;

        Item(double cost, String category) {
            this.cost = cost;
            this.category = category;
        }
    }

    private HashMap<String, Item> groceryList = new HashMap<>();

    // Add an item with cost and category
    public void addItem(String item, double cost, String category) {
        if (groceryList.containsKey(item)) {
            System.out.println(item + " is already in the grocery list.");
        } else {
            groceryList.put(item, new Item(cost, category));
            System.out.println(item + " has been added with a cost of $" + cost + " in category " + category);
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

    // Display all items
    public void displayList() {
        System.out.println("Grocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            int i = 1;
            for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
                System.out.println(i + ". " + entry.getKey() + " - $" + entry.getValue().cost + " [" + entry.getValue().category + "]");
                i++;
            }
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        int count = 0;
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            if (entry.getValue().category.equalsIgnoreCase(category)) {
                count++;
                System.out.println(count + ". " + entry.getKey() + " - $" + entry.getValue().cost);
            }
        }
        if (count == 0) {
            System.out.println("No items found in this category.");
        }
    }

    // Check if an item exists
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0.0;
        for (Item item : groceryList.values()) {
            total += item.cost;
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager3 manager = new GroceryListManager3();

        // Adding items
        manager.addItem("Apples", 2.5, "Fruits");
        manager.addItem("Milk", 1.8, "Dairy");
        manager.addItem("Bread", 2.0, "Bakery");
        manager.addItem("Cheese", 3.0, "Dairy");

        System.out.println();
        manager.displayList();

        System.out.println();
        manager.displayByCategory("Dairy");

        System.out.println();
        manager.displayByCategory("Fruits");

        System.out.println();
        manager.displayByCategory("Vegetables");
    }
}
