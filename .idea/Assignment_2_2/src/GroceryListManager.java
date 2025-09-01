import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();

    // Add an item to the grocery list
    public void addItem(String item) {
        if (groceryList.contains(item)) {
            System.out.println(item + " is already in the grocery list.");
        } else {
            groceryList.add(item);
            System.out.println(item + " has been added to the grocery list.");
        }
    }

    // Remove an item from the grocery list
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println(item + " has been removed from the grocery list.");
        } else {
            System.out.println(item + " is not in the grocery list.");
        }
    }

    // Display all items in the grocery list
    public void displayList() {
        System.out.println("Grocery List:");
        if (groceryList.isEmpty()) {
            System.out.println("The grocery list is empty.");
        } else {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }

    // Check if an item is in the grocery list
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");
        manager.addItem("Milk"); // Duplicate item

        // Displaying the list
        manager.displayList();

        // Checking an item
        System.out.println("\nIs \"Milk\" in the grocery list? " + manager.checkItem("Milk"));

        // Removing an item
        System.out.println("\nRemoving \"Milk\" from the list...");
        manager.removeItem("Milk");
        manager.removeItem("Cheese"); // Non-existent item

        // Displaying updated list
        System.out.println();
        manager.displayList();
    }
}
