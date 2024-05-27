import java.util.Scanner;

public class VonNeumanLovesBinary
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= s.nextInt();
        }

        for (int i=0;i<n;i++)
        {
            System.out.print(BinarytoInteger(arr[i])+" ");
        }


    }
    public static int BinarytoInteger(int n)
    {
        int ans=0;
        int pow=1;
        while(n>0)
        {
            int rem=n%10;
            ans= ans+rem*pow;
            pow=pow*2;
            n=n/10;

        }
        return ans;
    }
}
