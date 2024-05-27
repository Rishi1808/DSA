import java.util.Scanner;
public class BInaryToDeciamal
{
    public static  int decimal(int n)
    {
        int ans=0,count=0;
        while (n!=0)
        {
            int rem=n%10;
            ans=ans+(rem*(int)Math.pow(2,count));
            count++;
            n=n/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(decimal(n));
    }
}
