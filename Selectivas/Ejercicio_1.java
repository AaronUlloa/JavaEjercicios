import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String cbarra = "";
        float art = 0, total = 0;
        double costo = 0;

        //Pedir Datos
        System.out.print("\n Ingrese Codigo de Barra: ");
        cbarra = data.nextLine();
        do
        {
            System.out.print("\n Digite la cantidad de articulos: ");
            art = data.nextInt();
            if (art == 4)
            {
                art--;
            }
        }
        while (art <= 0);

        do
        {
            System.out.print("\n Ingrese el costo del articulo: ");
            costo = data.nextDouble();
        }
        while (costo <= 0);

        //Operaciones
        total = (float) (art * costo);

        //Logico
        if (total > 300)
        {
            System.out.print("\n Por cada 100 pesos de compra se te obsequiaran 10 pesos en vale \n");
        }

        //Imprimir
        System.out.print("\n Total a pagar es de: "+total+"\n");
    }
}