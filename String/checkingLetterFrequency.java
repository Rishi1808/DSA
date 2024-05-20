import java.util.Scanner;
public class checkingLetterFrequency {
 public static boolean checkFreq(String s)
 {
     int[] alpha= new int[26];
        for(int i=0;i<s.length();i++)
        {
            int indx=s.charAt(i)-'a';
            alpha[indx]++ ;
        }

        for (int i=0;i<alpha.length;i++)
        {
            if(alpha[i]>1){
                return false;}
        }

        return true;
 }
    public static void main(String[] args) {
        //code to take user input using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        //calling the function to check the frequency of the letters
        if(checkFreq(str))
            System.out.println("The string has unique characters");
        else
            System.out.println("The string has duplicate characters");

        System.out.println(checkFreq(str));

    }
}
