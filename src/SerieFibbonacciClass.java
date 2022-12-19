public class SerieFibbonacciClass
{
    public static void main(String[] args)
    {
        int num = 10, first = 0, second = 1;
        System.out.print("Fibonacci series of " + num + " numbers:");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
