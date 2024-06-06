public class PlaindromicSubstring
{
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
    public static int countSubstrings(String s) {
        int count=0;
        int odd=0;
        for (int axis=0;axis<s.length();axis++)
        {
            for (int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++)
            {
                if (s.charAt(axis-orbit)!=s.charAt(axis+orbit))
                {
                    break;
                }
               odd++;
            }
        }
        int even=0;
        for (double axis=0.5;axis<s.length();axis++)
        {
            for (double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++)
            {
                if (s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit)))
                {
                    break;
                }
                even++;
            }

        }
        count=odd+even;
        return count;
    }
}
