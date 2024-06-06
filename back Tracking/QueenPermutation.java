import java.util.Scanner;

public class QueenPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nq=s.nextInt();
        int nb=s.nextInt();
        boolean[] board=new boolean[nb];
        permutaion(board,nq,"",0);
    }
    public  static  void permutaion(boolean[] board,int nq,String ans,int qpsf)
    {
        //base case
         if(qpsf==nq)
         {
             System.out.println(ans);
             return;
         }

        // reursion
        for(int i=0;i<board.length;i++)
        {
            if(board[i]==false)
            {
                board[i]=true;
                permutaion(board,nq,ans+"BOX"+i+"QueenNo."+qpsf+" ",qpsf+1);
                board[i]=false; // backtracking (due to board[i]=true;when we are returning from the function we have to make it false)
            }
        }
    }
}
