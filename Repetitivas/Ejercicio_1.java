import java.util.Scanner;

public class Ejercicio_1 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int n = 1;

        while (n >= 1)
        {
            System.out.print("\n Ingrese un numero Positivo: ");
            int numero = data.nextInt();

            //logico
            if (numero < 1)
            {
                break;
            }
            n++;
        }
    }
}