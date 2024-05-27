import java.util.Scanner;
public class inverseArrayWithIndex
{
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();

        arr=inverse(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

    public static int[] inverse(int[] arr,int n){
        int[] ans= new int[n];
        for(int i=0;i<n;i++)
        {
            ans[arr[i]]=i;
        }

        return ans;
    }
}
