public class validSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean val=false;
              valid(board,0,0);
        System.out.println(flag);

    }
    public static boolean flag=false;
    public static void valid(char [][] board,int row,int col )
    {
        //base case
        if (col==9)
        {
            row++;
            col=0;
        }
        if (row==board.length)
        {
            return ;
        }

       //recurison
        if (board[row][col]=='.')
        {
            valid(board,row,col+1);
        }
        else {
            for (char i='1';i<='9';i++)
            {
                if (isSafe(board,row,col,i))
                {
                    flag=true;
                    valid(board,row,col+1);

                }
            }

        }

     }
     public static boolean isSafe(char[][] board,int row,int col,char val)
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
}
