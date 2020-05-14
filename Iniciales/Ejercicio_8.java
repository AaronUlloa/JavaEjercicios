//package Iniciales;
import java.lang.Math;
import java.util.Scanner;
public class Ejercicio_8 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        double pi = 3.1416;
        double r = 0.0f;
        double rs = 0.0, vl;

        //Logico
        do
        {
            System.out.print("\n Ingrese el radio: ");
            r = data.nextFloat();
        }
        while (r <= 0);

        //Formulas
        System.out.print("\n Perimetro : "+(2*pi*r));
        System.out.print("\n Area : "+(pi* (Math.pow(r, 2))));
        vl = ((4 * pi) * (Math.pow(r, 3) / 3));
        System.err.print("\n Volumen : "+vl+"\n");
    }    
}