import java.util.Scanner;
public class String_Compression {
    public static void main(String[] args) {
        // Uncomment the lines below to take input from the user
        Scanner ss = new Scanner(System.in);
        String s = ss.nextLine();
        ss.close();

        System.out.println(compress(s));
    }

    public static String compress(String s) {
        String ans = "";
        int count = 1;
        ans+= s.charAt(0);
        for (int i=1;i<s.length();i++)
        {
            if (s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(count==1)
                {
                    ans+=count;
                    count=1;
                    ans+=s.charAt(i);
                }
                else {
                    ans+=count;
                    count=1;
                    ans+=s.charAt(i);
                }
            }

        }
        ans+=count;
        return ans;
    }
}
// Time Complexity: O(n)