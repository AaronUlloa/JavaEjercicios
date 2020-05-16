import java.util.Scanner;

public class Ejercicio_9 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        int n = 0;
        char sexo = ' ';
        int suma1 = 0, suma2 = 0;

        do
        {
            System.out.print("\n Ingrese valor de N: ");
            n = data.nextInt();
        }
        while (n <= 0);

        System.out.print("\n Ingrese sexo del usuario (V/M) \n");
        sexo = data.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        while (n != 0)
        {
            System.out.print("\n Ingrese sexo del usuario (V/M) \n");
            sexo = data.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            if (sexo == 'V')
            {
                    
                suma1++;
    
            }
            else if (sexo == 'M')
            {
                    
                suma2++;
        
            }
            else if (sexo != 'V' || sexo != 'M')
            {
                System.out.print("\n Lo sentimos, Sexo indefinido \n");
            }
            
            n--;
        }
        System.out.print("\n Existen "+suma1+" Varones \n");
        System.out.print("\n Existen "+suma2+" Mujeres \n");
    }
}