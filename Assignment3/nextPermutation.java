import java.util.Scanner;
public class nextPermutation {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            int  n= s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++)
                arr[i]=s.nextInt();
            nextpermutation(arr);
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");

            System.out.println();
            t--;
        }

    }
    public static void nextpermutation(int[] arr)
    {
        int ind=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        {
            reverse(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>ind;i--)
        {
            if(arr[i]>arr[ind])
            {
                swap(arr,i,ind);
                break;
            }
        }
        reverse(arr,ind+1,arr.length-1);
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public  static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

}
