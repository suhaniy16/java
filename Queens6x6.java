public class Queens6x6 {

    private static final int BOARD_SIZE = 6;
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

    public static void main(String[] args) {
        if (solveQueens(0)) {
            System.out.println("Solution found for 6x6 Queen's Problem:");
            printBoard();
        } else {
            System.out.println("No solution found for 6x6 Queen's Problem.");
        }
    }

    /**
     * Solves the N-Queens problem using a backtracking approach.
     *
     * @param col The current column to place a queen.
     * @return true if a solution is found, false otherwise.
     */
    private static boolean solveQueens(int col) {
        // Base case: If all queens are placed, a solution is found.
        if (col >= BOARD_SIZE) {
            return true;
        }

        // Try placing a queen in each row of the current column.
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(row, col)) {
                // Place the queen.
                board[row][col] = 1;

                // Recur for the next column.
                if (solveQueens(col + 1)) {
                    return true;
                }

                // Backtrack: If placing the queen doesn't lead to a solution, remove it.
                board[row][col] = 0;
            }
        }

        // No row in the current column is safe, so return false.
        return false;
    }

    /**
     * Checks if placing a queen at a given position is safe.
     *
     * @param row The row to check.
     * @param col The column to check.
     * @return true if it's safe to place a queen, false otherwise.
     */
    private static boolean isSafe(int row, int col) {
        // Check for queens in the same row to the left.
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < BOARD_SIZE && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
