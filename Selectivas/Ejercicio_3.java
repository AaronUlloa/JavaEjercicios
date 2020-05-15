import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String N_auto = "";
        int N_millas = 0;
        int klrecorridos = 0;
        int N_gasolina = 0;


        //Datos
        System.out.print("\n Ingrese Numero de Auto: ");
        N_auto = data.next();
        do
        {
            System.out.print("\n Digite el numero de millas recorridas: ");
            N_millas = data.nextInt();

            //Condicion
            if (N_millas > 80)
            {
                System.out.print("\n Esta arriba del límite de velocidad \n");
            }
        }
        while (N_millas <= 0);
        do
        {
            System.out.print("\n Ingrese Kilometros recorridos del auto: ");
            klrecorridos = data.nextInt();

            //Codicion
            if (klrecorridos > 200 && klrecorridos < 350)
            {
                System.out.print("\n Hace falta mantenimiento al auto \n");
            }
        }
        while (klrecorridos <= 0);
        do
        {
            System.out.print("\n Ingrese cuantos Kilometros recorre un auto con un Litro de Gasolina: ");
            N_gasolina = data.nextInt();
        }
        while (N_gasolina < 10 || N_gasolina > 16);

        //Logico
        if (N_gasolina == 14 || N_gasolina == 16)
        {
            System.out.print("\n Consume poca Gasolina \n");
            System.out.print("\n Un auto que recorre 100 kilometros gasta "+(100/N_gasolina)+" Litros de Gasolina \n");            
        }
        else
        {
            System.out.println();
        }
        if (N_gasolina == 10 ||N_gasolina == 13)
        {
            System.err.print("\n Consume algo de gasolina \n");
        }
        else
        {
            System.out.println();
        }
    }
}