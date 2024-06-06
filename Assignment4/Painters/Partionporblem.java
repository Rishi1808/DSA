package Painters;
import java.util.*;

public class Partionporblem
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int k= s.nextInt();
        int n=s.nextInt();
        int[] board=new int[n];
        for (int i=0;i<n;i++)
            board[i]=s.nextInt();

        System.out.println(partition(board,n,k));

    }
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static int partition(int[] board,int n,int k)
    {
        int low=max(board),ans=0;
        int high=0;
        for (int i=0;i<n;i++)
            high+=board[i];
        while (low<high) // Change: We need to find the minimum time, so the loop condition should be 'low < high'
        {
            int mid=low+(high-low)/2;
            if(isIspossible(board,k,mid))
            {
                ans=mid;
                high=mid; // Change: Update high to mid, as we need to find the minimum possible time
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public static boolean isIspossible(int[] board,int k,int mid)
    {
        int painter=1;
        int painted=0;
        int i=0;
        while (i<board.length)
        {
            if (painted+board[i]<=mid)
            {
                painted+=board[i];
                i++;
            }
            else
            {
                painter++;
                painted=0;
            }
            if(painter>k)
                return false;
        }
        return true;
    }
}
