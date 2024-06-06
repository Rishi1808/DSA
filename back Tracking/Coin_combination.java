public class Coin_combination
{
    public static void main(String[] args) {

    }
    public static void ccom(int[] coin,int amount ,String ans,int idx)
    {
        if (amount==0)
        {
            System.out.print(ans+" ");
            return;
        }
        for (int i=idx;i<coin.length;i++)
        {
            if(amount<=coin[i])
            {
                ccom(coin, amount-coin[i], ans+coin[i]+" ", i);
            }
        }
    }
}
