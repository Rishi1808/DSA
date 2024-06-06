public class Capitalize_the_Title
{
    public static void main(String[] args) {
        System.out.println(title("capiTalIze tHe titLe"));

    }
    public static String title(String s)
    {
        String ans="";
        for (int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                if(s.charAt(i)>=97 && s.charAt(i)<=122)
                {
                    ans+=(char)(s.charAt(i)-32);
                }
                else
                {
                    ans+=(s.charAt(i));
                }

            }
            else if(s.charAt(i)==' ')
            {
                ans+=s.charAt(i);
                if(s.charAt(i+1)>=97 && s.charAt(i+1)<=122)
                {
                    ans+=Character.toUpperCase(s.charAt(i+1));
                }
                else
                {
                    ans+=(s.charAt(i+1));
                }
                i++;
            }
            else
            {
                if (s.charAt(i)>=65 && s.charAt(i)<=90)
                {
                    ans+=Character.toLowerCase(s.charAt(i));
                }
                else
                {
                    ans+=s.charAt(i);
                }

            }
        }
        return ans;
    }
}
