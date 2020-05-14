//package Iniciales;
import java.util.Scanner;

public class Ejercicio_5 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        double precio, total;
        double porc = 0;

        //Opciones
        do
        {
            System.out.print("\n Ingrese Precio: ");
            precio = data.nextDouble();
        }
        while (precio <= 0);
        do
        {
            System.out.print("\n Ingrese descuento: ");
            porc = data.nextInt();
        }
        while (porc < 0 || porc > 100);

        //Operacion
        porc = (precio*porc);
        porc /= 100;
        total = precio - porc;
        //Imprimiendo
        System.out.print("\n Precio Total: "+total);
    }    
}