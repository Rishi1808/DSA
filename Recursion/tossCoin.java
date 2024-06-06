
import java.util.Scanner;

public class tossCoin
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        toss(n,"");

    }
    public static void toss(int n,String s){
        if(n==0)
        {
            System.out.println(s+" ");
            return;
        }
        toss(n-1,s+"H");
        toss(n-1,s+"T");
    }
}
