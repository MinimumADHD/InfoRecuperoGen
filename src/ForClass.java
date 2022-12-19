public class ForClass
{
    public static void main(String[] args)
    {
        // Creo un loop for dichiarando variabile intera, che continua i<10
        for (int i=0; i<10; i++)
        {
            // Printa il numero i ogni volta
            System.out.println(i);
            System.out.println((i+2)*3);
        }
        System.out.println("-_CAMBIO_-");
        // Creo un loop for dichiarando due variabili intere, continua finché i<5 E j>7, incrementando i di uno ogni volta e decrementando j di uno.
        for (int i = 0, j = 10; i<5 && j > 7; i++, j--)
        {
            System.out.println(i+";"+j);
        }
    }
}
