//package Iniciales;
import java.util.Scanner;
public class Ejercicio_6 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int x[] = new int[2];
        int mult = 1, suma = 0;

        //Obtener datos
        System.out.print("Ingrese L1 y L2 \n");
        for (int i = 0 ; i < x.length ; i++)
        {

            x[i] = data.nextInt();
            suma += x[i];
            mult *= x[i];
        }

        //Resultado
        System.out.print("\n Perimetro = "+suma);
        System.err.print("\n Area = "+mult+"\n");
    }    
}