import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nQueensII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nqueen(board, 0 );
        System.out.println(count);
    }
   public static int count=0;
    public static void nqueen(char[][] board, int row) {
        // base case
        if (row == board.length) {
            count++;
            return;
        }

        // recursion
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nqueen(board, row + 1);
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
