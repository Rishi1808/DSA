import java.util.Scanner;

public class PERMUATION_UNIQUE
{
    public static void main(String[] args) {
        String s="";
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        permutation(s,"");
    }
    public static void permutation(String ques,String ans)
    {
        //base case
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }

        //recursive case

        for (int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            permutation(s1+s2,ans+ch);
        }
    }
}
