import java.util.Scanner;


public class Ejercicio_3 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int numero;

        do
        {
            System.out.print("\n Ingrese un numero: ");
            numero = data.nextInt();
        }
        while (numero < 0 || numero > 999);

        //Logico
        if (numero > 0)
        {
            int suma = 0;

            while (numero != 0)
            {
                numero /= 10;
                suma++; 
            }
            System.out.print("\n El numero ingresado tiene "+suma+" Cifras \n");
        }
        else
        {
            System.out.println();
        }
    }    
}