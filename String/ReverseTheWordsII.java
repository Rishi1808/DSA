import java.util.Scanner;
public class ReverseTheWordsII
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
    public static char[] reverse(char[] arr)
    {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            s.append(arr[i]);
        }
        String str=rev(s.toString());
        char[] ch=str.toCharArray();
        return ch;
    }
    //funtion to print char array
    public static void print(char[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        //taking input char type array fromuser using loop and  scanner
        System.out.println("enter the length of the array");
     Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert the input string to a character array
        char[] charArray = input.toCharArray();
        //calling the function to reverse the words in the sentence
        print(reverse(charArray));


    }
}
