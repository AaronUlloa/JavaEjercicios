
import java.util.*;

public class empresa 
{
  public static void main(String[] args) 
  {
      Scanner data = new Scanner(System.in);
      String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
      double ing[] = new double[12];
      int opc1, i, j, suma = 0, ventas = 0;
      boolean bandera = false;

      System.out.print("\n***** Digite los Ingresos del año 2019 *****\n");

      for (i = 0 ; i < mes.length ; i++)
      {
        System.out.print(mes[i]+" = ");
        do
        {
          ing[i] = data.nextDouble();
          suma += ing[i];

          if (ing[i] >= 70.0)
          {
            ventas++;
          }
        }
        while (ing[i] < 0);
      }

      do
      {
        do
        {
          System.out.print("\n\n\t\t ********** MENU ********** \n\n"
                          +"\t 1.Visualizar Ingresos. \n"
                          +"\t 2.Visualizar el mes con los mayores Ingresos. \n"
                          +"\t 3.Visualizar el mes con los menores Ingresos. \n"
                          +"\t 4.Determinar el promedio de Ingresos. \n"
                          +"\t 5.Consultar si se obtuvieros x Ingresos. \n"
                          +"\t 6.Determinar en cuantos meses se supero la meta de ventas. \n"
                          +"\t 7.Salir. \n");
          System.out.print("\t : ");
          opc1 = data.nextInt();
        }
        while (opc1 < 0 || opc1 > 7);
        
        switch(opc1)
        {
          case 1:
            {
              System.out.print("\n***** Visualizando Ingresos *****\n");
              for (i = 0 ; i < mes.length ; i++)
              {
                System.out.print("||"+mes[i]+" = ");
                System.out.print(ing[i]);
                System.out.println();
              }
              break;
            }
          case 2:
            {
              System.out.print("\n***** Visualizando el mes con mayor Ingreso *****\n");
              double mayor;
              mayor = ing[0];
              String index = " ";
              for (j = 0 ; j < ing.length ; j++)
              {
                if (ing[j] > mayor)
                {
                  mayor = ing[j];
                  index = mes[j];
                }
              }
              System.out.print("\n*** El mes con mayor Ingreso es: "+index+" con un Ingreso de "+mayor+" ***\n");
              break;
            }
          case 3:
            {
              System.out.print("\n***** Visualizando el mes con los menores Ingresos *****\n");
              double menor;
              menor = ing[0];
              String index = " ";
              for (j = 0 ; j < ing.length ; j++)
              {
                if (ing[j] < menor)
                {
                  menor = ing[j];
                  index = mes[j];
                }
              }
              System.out.print("\n*** El mes con menor Ingresos es: "+index+" con un ingreso de "+menor+" ***\n");
              break;
            }
          case 4:
            {
              System.out.print("\n***** Determinando el Promedio de los Ingresos. *****\n");
              double promedio;
              promedio = (suma/ing.length);
              System.out.print("\n*** El promedio de los Ingresos es de: "+promedio+" ***\n");
              break;
            }
          case 5:
            {
              System.out.print("\n**** Consultando Ingreso Reales. *****\n");
              boolean bn = false;
              for (j = 0 ; j < ing.length ; j++)
              {
                if (ing[j] > 0)
                {
                  bn = true;
                }
                else
                {
                  bn = false;
                }
              }
              if (bn == true)
              {
                System.out.print("\n*** Si se obtuvieros Ingresos Reales. ***\n");
              }
              else
              {
                System.out.print("\n*** Lo sentimos, No se obtuvieros Ingreso Reales. ***\n");
              }
              break;
            }
          case 6:
            {
              System.out.print("\n***** Visualizando Ventas Superadas en el año *****\n");

              if (ventas > 0)
              {
                System.out.print("\n*** Hay "+ventas+" ventas que superan las ventas. ***\n");
              }
              else
              {
                System.out.print("\n*** Lo sentimos, No se superaron las ventas.");
              }
              break;
            }
          case 7: bandera = true;
        }

        if (bandera == false)
        {
          try {
            Thread.sleep(5000);
          }catch (Exception e){}
        }
        else if (bandera == true)
        {
          break;
        }

      }
      while (bandera == false);
  }
}
