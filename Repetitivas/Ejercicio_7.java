import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Ejercicio_7 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int dias = 10;
        int suma = 0, tiempo = 0, i = 1;
        float prom = 0;
        boolean bandera = false;

        while (dias > 0)
        {
             
            
            do
            {
                System.out.print("\n Ingrese tiempo del "+(i)+" dia: ");
                tiempo = data.nextInt();
            }
            while (tiempo < 0);
            suma += tiempo;
            i++;
            if (tiempo < 16)
            {
                bandera = false;
            }
            else if (tiempo > 16)
            {
                bandera = true;
            }
            prom = (float) (suma / 10);

            dias--;
            
        }

        if (bandera == false)
        {
            System.out.print("\n A \n");
        }
        else if (bandera == true)
        {
            System.out.print("\n B \n");
        }
        if (prom <= 15.0)
        {
            System.out.print("\n C \n");
        }
    }    
}