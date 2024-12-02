import java.util.ArrayList;

public class Grid<T> {
    private T[][] grid;
    private static int maxSideLength = 0;

    public Grid(T[][] grid) {
        this.grid = grid;
        if (grid.length > maxSideLength) {
            maxSideLength = grid.length;
        }
    }

    public ArrayList<T> diagonal() {
        ArrayList<T> diagonalElements = new ArrayList<>();
        int size = grid.length;
        for (int i = 0; i < size; i++) {
            diagonalElements.add(grid[i][i]);
        }
        return diagonalElements;
    }

    public static int maxSideLength() {
        return maxSideLength;
    }
}
