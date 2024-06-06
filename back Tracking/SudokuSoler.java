public class SudokuSoler
{
    public static void main(String[] args) {
        int [][] board={{5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}};
solver(board,0,0);

    }
    public static void  solver(int[][] board,int row,int col)
    {
        //base case
        if (col==9)
        {
            row++;
            col=0;
        }
        if (row==board.length)
        {
            print(board);
            return;
        }

        //recusion
        if(board[row][col]!=0)
        {
            solver(board,row,col+1);
        }
        else
        {
            for (int val=1;val<=9;val++)
            {
                if (isSafe(board,row,col,val))
                {
                    board[row][col]=val;
                    solver(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }
    }
    public static boolean isSafe(int[][] board,int row,int col,int val)
    {
        for (int i=0;i<9;i++)
        {
            if (board[i][col]==val)
            {
                return false;
            }
        }
        for (int i=0;i<9;i++)
        {
            if (board[row][i]==val)
            {
                return false;
            }
        }

        int r=row-row%3;
        int c=col-col%3;
        for (int i=r;i<r+3;i++)
        {
            for (int j=c;j<c+3;j++)
            {
                if (board[i][j]==val)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void print(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (col == 3 || col == 6) {
                    System.out.print(" | ");
                }
                System.out.print(board[row][col] == 0 ? " " : board[row][col]);
                System.out.print(" ");
            }
            System.out.println();
            if (row == 2 || row == 5) {
                System.out.println("------+-------+------");
            }
        }
    }
}
