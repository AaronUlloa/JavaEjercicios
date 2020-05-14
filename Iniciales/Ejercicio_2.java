//package Iniciales;
import java.util.Scanner;
public class Ejercicio_2 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int x = 0;
        
        do
        {
            System.out.print("\n Cuantos años tienes: ");
            x = data.nextInt();
        }
        while (x < 0);

        // Resultado Final
        System.out.print("\n Ahora sè que tienes: "+x+" años\n");
    }    
}