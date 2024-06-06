public class pow {
    public static double powPos(double x,int n)
    {
        if(n==1)
            return x;

        double y=x*(powPos(x,n-1));
        return y;
    }
    public static double powNeg(Double x,int n)
    {
        if(n==0)
            return 1.0;
        double y=1/x*(powNeg(x,n+1));
        return y;
    }

    public static void main(String[] args) {
        System.out.println(powPos(4.0,9));
    }
}
