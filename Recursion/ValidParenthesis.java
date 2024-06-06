import java.util.Scanner;

public class ValidParenthesis
{
    public static void vali(int n,int open,int close,String ans)
    {
        if(open==n && close==n)
        {
            System.out.print(ans+" ");
            return;
        }
        if(open>n || close>open)
            return;

        vali(n,open+1,close,ans+"(");
        vali(n,open,close+1,ans+")");
    }

    public static void main(String[] args) {
        Scanner s= new Scanner((System.in));
        int n=s.nextInt();
        vali(n,0,0,"");
    }
}
