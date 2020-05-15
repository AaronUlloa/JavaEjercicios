import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int dt = 0;
        int suma = 0;

        do
        {
            System.out.print("\n \t Ingrese longitud de la lista: ");
            dt = data.nextInt();
        }
        while (dt < 1);

        for (int i = 0 ; i < dt ; i++)
        {
            System.out.print("\n Ingrese Numero Cualquiera: ");
            int n = data.nextInt();

            //Logico
            if (n > 0)
            {
                suma++;
            }
        }
        System.out.print("\n Ha ingresado "+suma+" Numeros positivos \n");
    }
}