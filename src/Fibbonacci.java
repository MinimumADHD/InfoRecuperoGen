import java.util.Scanner;
public class Fibbonacci
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        int NumeroSerie = Integer.parseInt(sc.nextLine()), PrimoNum = Integer.parseInt(sc.nextLine()), SecondoNum = Integer.parseInt(sc.nextLine());
        System.out.print("Fibonacci series of " + NumeroSerie + " numbers:");

        for (int i = 1; i <= NumeroSerie; ++i)
        {
            System.out.print(PrimoNum + " ");

            int Somma = PrimoNum + SecondoNum;
            PrimoNum = SecondoNum;
            SecondoNum = Somma;
        }
    }
}