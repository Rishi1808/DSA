import java.util.Scanner;

public class Nfibbonaci {



    //same code using for loop
    public static int NfibbonaciUsingForLoop(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(NfibbonaciUsingForLoop(n));
    }
}
