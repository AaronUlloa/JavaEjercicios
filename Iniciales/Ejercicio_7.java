//package Iniciales;
import java.util.Scanner;
public class Ejercicio_7 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        double eu = 1.0;
        double cam = 1.33250;
        double dl = 0.0;

        //Logico
        do
        {
            System.out.print("\n Ingrese la cantidad en dolares: ");
            dl = data.nextDouble();
        }
        while (dl <= 0);

        //Cambio
        eu = (dl * eu) / cam;

        //Imprimir
        System.out.print("\n Su cambio en euros es: "+eu+"\n");
    }    
}