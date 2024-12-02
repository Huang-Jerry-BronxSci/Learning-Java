public class Main {
    public static void returnAllToLibrary(LibraryItem[] items) {
        for (LibraryItem item : items) {
            if (item != null) {
                item.returnToLibrary();
            }
        }
    }
}
