public class subString
{
    public static String substring(String s ,int start,int end)
    {
        String str="";
        for(int i=start;i<end;i++)
        {
            str+=s.charAt(i);
        }
        return str;
    }
    public static String substring(String s ,int start)
{
    String str="";
    for(int i=start;i<s.length();i++)
    {
        str+=s.charAt(i);
    }
    return str;
}
public static void allSubset(String s)
{
    for (int i=0;i<s.length();i++)
    {
        for (int j=1+i;j<=s.length();j++)
        {
            System.out.print(substring(s,i,j)+" ");
        }
        System.out.println( );
    }
}
    public static void main(String[] args) {

        String s="codingblocks";
        allSubset(s);
    }
}
