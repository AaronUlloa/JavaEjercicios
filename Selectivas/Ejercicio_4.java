import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int n_jugador = 0;
        int n_tiros = 0;
        int n_fallos = 0;
        int n_puntos = 0;

        //Datos
        do
        {
            System.out.print("\n Ingrese el numero del Jugador: ");
            n_jugador = data.nextInt();
        }
        while (n_jugador <= 0);
        do
        {
            System.out.print("\n Digite cuantos tiros anoto el jugador: ");
            n_tiros = data.nextInt();
        }
        while (n_tiros < 0);
        do
        {
            System.out.print("\n Cuantos tiros Fallo el jugador: ");
            n_fallos = data.nextInt();
        }
        while (n_fallos < 0);

        //Logico
        if (n_fallos >= 1 && n_tiros >= 1)
        {
            System.out.print("\n Hizo "+(n_tiros + n_fallos)+" tiros en total \n");
            System.out.print("\n Tiene "+n_tiros+" Tiros anotados \n");
            System.out.print("\n Tiene "+n_fallos+" Tiros Fallados \n");
        }

        do
        {
            System.out.print("\n Ingrese Los puntos anotados del jugador: ");
            n_puntos = data.nextInt();
        }
        while (n_puntos < 0 ||n_puntos > 22);

        //Logico
        if (n_puntos >= 3 && n_puntos <= 6)
        {
            System.out.print( "\n Anotó pocos puntos \n");
        }
        else if (n_puntos >= 7 && n_puntos <= 15)
        {
            System.out.print("\n Anotó puntos aceptables \n");
            System.out.print("\n Pudo haber anotado "+(n_puntos/3)+" en un promedio de 3 \n");
        }
        else if (n_puntos >= 16 && n_puntos <= 22)
        {
            System.out.print("\n Felicidades por sus anotaciones \n");
            System.out.print("\n Pudo haber anotado "+(n_puntos/3)+" en un promedio de 3 \n");
        }
    }
}