//package Iniciales;
import java.util.Scanner;
public class Ejercicio_9 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        double a, b, c;
        double x1, x2;
        do
        {
            System.out.print("\n Ingrese a, b, c \n");
            a = data.nextInt(); b = data.nextInt(); c = data.nextInt();
        }
        while (a <= 0 || b <= 0 || c <= 0);

        //Logico
        x1 = (((-b) + (Math.sqrt((Math.pow(b, 2)) - 4*a*c))) / 2*a);
        x2 = (((-b) - (Math.sqrt((Math.pow(b, 2)) - 4*a*c))) / 2*a); 

        //Imprimir
        System.out.print("\n X1 = "+x1+"\n");
        System.out.print("\n X2 = "+x2+"\n");
    }
}