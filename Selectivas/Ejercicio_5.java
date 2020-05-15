import java.util.Scanner;


public class Ejercicio_5 
{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int codigo = 0;
        int an = 0;
        int mes = 0;
        int an_cad = 0;
    
    
        //Pedir Datos
        do
        {
            System.out.print("\n Ingrese codigo del producto: ");
            codigo = data.nextInt();
        }
        while (codigo < 0 || codigo > 150);
        do
        {
            System.out.print("\n Digite el año de elaboracion del producto: ");
            an = data.nextInt();
        }
        while (an < 0);
        do
        {
            System.out.print("\n Ingrese mes de Caducidad: ");
            mes = data.nextInt();
        }
        while (mes < 0);
        do
        {
            System.out.print("\n Digite año de Caducidad: ");
            an_cad = data.nextInt();
        }
        while (an_cad < 0);

        //Logico
        if ((codigo >= 80 || codigo <= 150) && (an == 2016) && (mes < 9) && (an_cad == 2020))
        {
            System.out.print("\n Producto Aceptable, El sistema lo agregara al almacen :) --- \n");
        }
        else 
        {
            System.out.print("\n Lo sentimos, El sistema no puede asignar un lugar en elalmacén debido a sus características dadas");
        }
    }
}