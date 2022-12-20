import java.util.Scanner;
public class NewLaptopTestClass
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a; i++)
        {
            if (a <= 1)
            {
                System.out.println("A non può essere <= 1");
                break;
            }
            else
                System.out.println(i);
        }
    }
}
