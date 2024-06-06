import java.util.Scanner;

public class QueenCombnation
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nq=s.nextInt();
        int nb=s.nextInt();
        boolean[] board=new boolean[nb];
        combination(board,nq,"",0,0);

    }
    public static  void combination(boolean[] board,int nq,String ans,int qpsf,int idx)// extra last index due to combination
    {
        if(qpsf==nq)
        {
            System.out.println(ans);
            return;
        }
        for (int i=idx;i<board.length;i++)
        {
            if (board[i]==false)
            {
                board[i]=true;
                combination(board,nq,ans+"box"+i+"q"+qpsf+" ",qpsf+1,i+1);
                board[i]=false;
            }
        }
    }

}
