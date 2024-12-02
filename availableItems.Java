import java.util.ArrayList;

public class Main {
    public static ArrayList<LibraryItem> getAvailableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availableItems = new ArrayList<>();

        for (LibraryItem item : items) {
            if (item != null && item.isAvailable()) {
                availableItems.add(item);
            }
        }

        return availableItems;
    }
}
