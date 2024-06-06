import java.util.Scanner;
public class kartikBhaiyaString
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.next();
        int k=s.nextInt();
        int a=perfectness(str,'a',k);
        int b=perfectness(str,'b',k);
int ans=( Math.max(a,b));
        System.out.println(ans);

    }
    public static int perfectness(String s,char ch,int k)
    {
       int ans=0;
       int si=0;
       int ei=0;
       int flip=0;
       while(ei<s.length()){
           //grow
           if(s.charAt(ei)==ch){
               flip++;
           }
           //shrink
           while (flip>k && si<=ei)
           {
               if(s.charAt(si)==ch)
                   flip--;
                si++;
           }
           //ans
           ans=Math.max(ans,ei-si+1);
           ei++;
        }
       return ans;
    }
}
