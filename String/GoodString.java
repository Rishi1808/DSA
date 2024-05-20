import java.util.Scanner;

public class GoodString
{
    public static int goodString(String s)
    {
        int ans=0,c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                c++;
            }
            else
            {
             ans=Math.max(c,ans);
             c=0;
            }
        }
        ans=Math.max(c,ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner scanner = new java.util.Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(goodString(s));

    }
}
