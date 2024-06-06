import java.util.Scanner;

public class subSequence
{
    public static void sequence(String ques ,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        sequence(ques.substring(1),ans);
        sequence(ques.substring(1),ans+ch);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ques=s.next();
        sequence(ques,"_");
    }
}
