//package Iniciales;
import java.util.Scanner;
public class Ejercicio_1 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int x = 0;
        
        do
        {
            System.out.print("\n Ingrese un numero entero: ");
            x = data.nextInt();
        }
        while (x < 0);

        // Resultado Final
        System.out.print("\n El numero ingresado es: "+x+"\n");
    }
}