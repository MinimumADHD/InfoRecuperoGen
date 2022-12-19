// Importo la LIBRERIA dello scanner da java.util
import java.util.Scanner;
public class RecOne
{
    // Dichiaro la variabile scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        // System.out.print() per  non usare spazio, inserire \n dentro una stringa per avviare lo spazio
        System.out.print("UwU\n");
        // System.out.println() per usare auto spazio
        System.out.println("UwU");

        // "richiamo" il metodo per usarlo
        MetodoUno();
    }
    // Dichiaro metodo MetodoUno in static void (Si può usare per tutto)
    static void MetodoUno()
    {
        // La variabile sc (scanner) prende input qualsiasi da tastiera, sc.nextLine() si usa di solito per le stringhe
        // Dichiaro variabile int con valore da tastiera
        int a,b;
        // .nextInt() produce uno spazio che non ci deve essere nel numero
        // a = sc.nextInt();
        // Integer.parseInt non produce lo spazio
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());

        // Stampa a;b
        System.out.println(a+";"+b);
    }
}