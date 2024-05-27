import java.util.Scanner;

public class MajorityElement
{
    public static int game(int[] arr)
    {
        int candidate=0;
        int point=0;
        for (int i=0;i<arr.length;i++)
        {
            if(point==0)
            {
                candidate=arr[i];
            }
            if(candidate==arr[i])
                point++;
            else
                point--;
        }
        return candidate;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(game(arr));
    }

}
