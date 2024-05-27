import java.util.Scanner;
public class FarenToCelcius
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        int max=s.nextInt();
        int step=s.nextInt();
        for (int i=min;i<=max;i+=step)
        {
            int celcius=(int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+celcius);
        }

    }
}
