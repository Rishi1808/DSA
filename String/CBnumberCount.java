import java.util.*;
public class CBnumberCount
{
    public static boolean isCBnum(long num)
    {
        if(num==0|| num==1)
        {
            return false;
        }
        int[] arr={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return true;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(num%arr[i]==0)
                return false;
        }
        return true;

    }
    public static int countCB(String s)
    {
        boolean[] visited = new boolean[s.length()];
        int count=0;
        for (int len=1;len<=s.length();len++)
        {
            for (int j=len;j<=s.length();j++)
            {
                int i=j-len;
                long num=Long.parseLong(s.substring(i,j));
                if(isCBnum(num)==true && isvisited(visited,i,j-1))
                {
                    count++;
                    for (int si=i;si<j;si++)
                    {
                        visited[si]=true;
                    }
                }
            }
        }
        return count;
    }
    public static boolean isvisited(boolean[] visited ,int i,int j)
    {
        for(int s=i;s<=j;s++)
        {
            if (visited[s]==true)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println("Count of CB numbers: " + countCB(s));
    }

}
