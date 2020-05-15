import java.util.Scanner;

public class Ejercicio_6 
{
    public static void main(String[] args) 
    {
        Scanner data = new Scanner(System.in);
        char calif = ' ';

        System.out.print("\n Ingrese la calificacion del producto: ");
        calif = data.nextLine().charAt(0);



        switch (Character.toUpperCase(calif))
        {
            case 'F': System.out.print("\n Frutas \n");
                      System.out.print("\n Tendra el 20 porciento de descuento todos los Martes \n");
                      break;
            case 'V': System.out.print("\n Verduras \n");
                      System.out.print("\n Tendra el 20 porciento de descuento todos los Martes \n");
                      break;
            case 'S': System.out.print("\n Salchichonería \n");
                      System.out.print("\n Tendra el 15 porciento de descuento todos los fines de semana \n");
                      break;
            case 'L': System.out.print("\n Lacteos \n");
                      break;
            case 'B': System.out.print("\n Bebes \n");
                      break;
            case 'D': System.out.print("\n Damas \n");
                      break;
            case 'C': System.out.print("\n Caballero \n");
                      break;
            case 'N': System.out.print("\n Niños \n");
                      break;
            case 'P': System.out.print("\n Perfumeria \n");
                      break;
            case 'M': System.out.print("\n Medicamento Farmaceutico \n");
                      break;
            case 'E': System.out.print("\n Electronico \n");
                      break;
            case 'H': System.out.print("\n Hogar \n");
                      break;
            case 'J': System.out.print("\n Jugeteria \n");
                      break;
            default: System.out.print("\n Producto Invalido \n");
        }
    }
}