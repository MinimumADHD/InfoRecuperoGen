import java.util.Scanner;

public class PalindromaClass
{
    static Scanner sc = new Scanner(System.in);
    static String InsertedChar;
    public static void main(String[] args)
    {
        SanityCheck();
        System.out.println("Inserire parola o frase.");
        InsertedChar = sc.nextLine();
        IsPalindrome(InsertedChar);
    }
    static void SanityCheck()
    {
        System.out.println("Sanity Check.");
    }
    public static boolean IsPalindrome(String InputWord)
    {
        char[] chars = InputWord.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        for (int i = 0; i < chars.length/2; i++) {
            SanityCheck();
            if (chars[start] != chars[end]) {
                SanityCheck();
                System.out.println("Non palindroma");
                return false;
            }
            start++;
            end--;
        }
        SanityCheck();
        System.out.println("Palindroma");
        return true;
    }
}
