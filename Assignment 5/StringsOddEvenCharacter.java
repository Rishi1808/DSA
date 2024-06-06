import java.util.*;
public class StringsOddEvenCharacter
{
      public static void main(String args[]) {
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       System.out.print(oddeven(str));
    }
    public static String oddeven(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2!=0)
            {
                ans+=(char)(s.charAt(i)-1);
            }
            else
                 ans+=(char)(s.charAt(i)+1); 
        
        }
        return ans;
    }
}