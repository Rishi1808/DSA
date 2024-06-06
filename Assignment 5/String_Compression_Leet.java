import java.util.Scanner;
public class String_Compression_Leet {
    public static void main(String[] args) {
        // Uncomment the lines below to take input from the user
        Scanner ss = new Scanner(System.in);
        String s = ss.nextLine();
        ss.close();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }

    public static int  compress(char[] chars) {

        int count = 1;
        int j=1;
       chars[0]= chars[0];
        for (int i=1;i<chars.length;i++)
        {
            if (chars[(i)]==chars[(i-1)])
            {
                count++;
            }
            else
            {
                if(count==1)
                {
//                    chars[j]=numberToChar( count);
                    j++;
                    count=1;
                    chars[j]=chars[(i)];
                    j++;
                }
                else {
//                    chars[j]=numberToChar( count);
                    j++;
                    count=1;
//                    chars[j]=chars[(i)];
                    j++;
                }
            }

        }

//        chars[j]=numberToChar( count);
       return j;
    }


}
