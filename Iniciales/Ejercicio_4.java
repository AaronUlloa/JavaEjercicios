//package Iniciales;
import java.util.Scanner;
public class Ejercicio_4 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        double altura = 0;
        char iniciales[] = new char [3];

        //Ingresando datos
        do
        {
            System.out.print("\n Ingrese su altura: ");
            altura = data.nextDouble();
        }
        while(altura <= 0);
        //Guardar datos a un array
        System.out.print("\n Ingrese sus Iniciales \n");
        for (int i = 0 ; i < iniciales.length ; i++)
        {
            System.out.print(" : ");
            iniciales[i] = data.next().charAt(0);
        }

        //Imprimimos resultado
        System.err.print("\n Su altura es de: "+altura+"\n");
        System.out.print("Sus iniciales son\n");
    //    for (int i = 0 ; i < iniciales.length ; i++)
    //    {
            System.out.print(iniciales);
    //    }
    }    
}