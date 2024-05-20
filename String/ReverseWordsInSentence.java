
import java.util.Scanner;
public class ReverseWordsInSentence
{
    public static String rev(String s)
    {
        String[] words = s.trim().split("\\s+");


        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
  //take user input using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        //calling the function to reverse the words in the sentence
        System.out.println(rev(str));
    }
}
