//package Iniciales;
import java.util.Scanner;
public class Ejercicio_6 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int x[] = new int[2];
        
        System.out.print("Ingrese L1 y L2: ");
        for (int i = 0 ; i < x.length ; i++)
        {
            x[i] = data.nextInt();
        }
    }    
}