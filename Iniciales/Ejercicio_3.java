//package Iniciales;
import java.util.Scanner;
public class Ejercicio_3 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int x, y, z;

        //Introduciendo Datos
        do
        {
            System.out.print("\n Ingrese Horas, Minutos y Segundos: ");
            x = data.nextInt(); y = data.nextInt(); z = data.nextInt();
        }
        while(x <= 0 && y <= 0 && z <= 0);

        //Operacion Logica
        if (y == 60)
        {
            x++;
            y = 0;
            if (z == 60)
            {
                y++;
                z = 0;
                if (x > 12)
                {
                    x = 1;
                }
            }
        }

        //Imprimiendo en Pantalla
        System.out.print("\n Hora Introducida OK, la hora es "+x+":"+y+":"+z+"\n");
    }    
}