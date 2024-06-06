public class FixedSized
{
    public static  int maxSum(int[] arr,int k)
    {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<k;i++)
            sum+=arr[i];

        for (int i=k;i<arr.length;i++)
        {
            sum+=arr[i]-arr[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        //TAKE INPUT ARRAR AND K
        int[] arr={2,3,4,1,2,3,7,6,8,2,3};
        int k=3;
        System.out.println(maxSum(arr,k));
    }
}
