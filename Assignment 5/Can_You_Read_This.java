public class Can_You_Read_This
{
    public static void main(String[] args) {
 print("IAmACompetitiveProgrammer");
    }
    public static void print(String s)
    {
        int i=0;
    int j=0;
    while(j<s.length()-1){
       if(s.charAt(j+1)>'Z')
       {
           j++;
       }else
       {
              System.out.println(s.substring(i,j+1));
              i=j+1;
              j++;
       }
    }
        System.out.println(s.substring(i,j+1) );

    }
}
