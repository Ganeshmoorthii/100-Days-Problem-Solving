import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        // Initialize the queue with all initially rotting oranges and count fresh oranges
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0) return 0; // No fresh oranges to rot

        int minutes = -1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // right, down, left, up

        // Perform BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            minutes++;
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                for (int[] direction : directions) {
                    int newRow = current[0] + direction[0];
                    int newCol = current[1] + direction[1];
                    if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        freshOranges--;
                        queue.add(new int[]{newRow, newCol});
                    }
                }
            }
        }

        return freshOranges == 0 ? minutes : -1; // If there are still fresh oranges left, return -1
    }
}
