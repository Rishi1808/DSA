import java.util.*;

public class nQueen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(board, 0, ans);
        System.out.println(ans);
    }

    public static void nqueen(char[][] board, int row, List<List<String>> ans) {
        // base case
        if (row == board.length) {
            ans.add(construct(board));
            return;
        }

        // recursion
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nqueen(board, row + 1, ans);
                board[row][col] = '.'; // backtracking
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // check right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
}
