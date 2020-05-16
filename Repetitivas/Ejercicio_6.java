import java.util.Scanner;

public class Ejercicio_6 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        char sexo = ' ';
        char ct = ' ';
        float mtr = 0, prom1 = 0, prom2 = 0,  cont1 = 0, cont2 = 0;
        int suma1 = 0, suma2 = 0;

        do
        {
        //    do
        //    {
                System.out.print("\n Ingrese sexo del usuario (V/M) \n");
                sexo = data.next().charAt(0);
        //        Character.isUpperCase(sexo);
        //    }
        //    while (sexo == 'V' || sexo == 'M');
            
            if (sexo == 'V')
            {
                do
                {
                    System.out.print("\n Ingrese Altura en metro: ");
                    mtr = data.nextFloat();
                }
                while (mtr < 0);
                suma1++;
                cont1 += mtr;
                prom1 = (float) (cont1/suma1);

            }
            else if (sexo == 'M')
            {
                do
                {
                    System.out.print("\n Ingrese Altura en metro: ");
                    mtr = data.nextFloat();
                }
                while (mtr < 0);
                suma2++;
                cont2 += mtr;
                prom2 = (float) (cont2/suma2);
            }
            else if (sexo != 'V' || sexo != 'M')
            {
                System.out.print("\n Lo sentimos, Sexo indefinido \n");
            }

            System.out.print("\n Desea continuar S/N \n");
            ct = data.next().charAt(0);
        }
        while (ct == 'S' || ct == 's');

        System.out.print("\n La estatura media de los varones es de: "+prom1+"\n");
        System.out.print("\n La estatura media de las mujeres es de: "+prom2+"\n");
    }
}