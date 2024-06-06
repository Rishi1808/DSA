import java.util.Scanner;

public class Strings_Toggle_Case
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(toggle(str));

    }
    public static String toggle(String s)
    {
        String ans="";
        for (int i=0;i<s.length();i++)
        {
            //capital to small
            if (s.charAt(i)<=90 && s.charAt(i)>=65) {
                ans = ans + (char) (s.charAt(i) + 32);
            }//small letter
            else if (s.charAt(i) >=97 && s.charAt(i)<=122) {
                ans = ans + (char) (s.charAt(i) - 32);
            }

        }
        return  ans;
    }
}
