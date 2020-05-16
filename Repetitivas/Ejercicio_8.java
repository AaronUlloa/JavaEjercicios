import java.util.Scanner;

public class Ejercicio_8
{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String animal = " ";

        System.out.print("\n Ingrese a cuales animales quiere determinar el promedio"+
                        "Elefantes, Jirafas, chimpancés: ");
        animal = data.nextLine();

        animal = animal.toLowerCase();
        switch (animal)
        {
            case "elefante":
            {
                int el = 20, suma1 = 0, suma2 = 0, suma3 = 0, edad = 0;
                float prom1 = 0, prom2 = 0, prom3 = 0;

                for (int i = 0 ; i < el ; i++)
                {
                    do
                    {
                        System.out.print("\n Ingrese edad del "+(i+1)+" Elefante: ");
                        edad = data.nextInt();
                    }
                    while (edad < 0);

                    if (edad == 0 || edad == 1)
                    {
                        suma1++;
                        prom1 = (el/suma1);
                    }
                    else if (edad > 1 && edad < 3)
                    {
                        suma2++;
                        prom2 = (el/suma2);
                    }
                    else if (edad >= 3)
                    {
                        suma3++;
                        prom3 = (el/suma3);
                    }
                }
                System.out.print("\n Se encuentran "+suma1+" elefante(s) con edades de 0 a 1 \n");
                System.out.print("\n Con un promedio de "+prom1+"\n");
                System.out.print("\n Se encuentran "+suma2+" elefante(s) con edades de 1 a 3 \n");
                System.out.print("\n Con un promedio de "+prom2+"\n");
                System.out.print("\n Se encuentran "+suma3+" elefante(s) con edades de 3 a mas \n");
                System.out.print("\n Con un promedio de "+prom3+"\n");
                break;
            }
            case "jirafa":
            {
                int jf = 15, suma1 = 0, suma2 = 0, suma3 = 0, edad = 0;
                float prom1 = 0, prom2 = 0, prom3 = 0;

                for (int i = 0 ; i < jf ; i++)
                {
                    do
                    {
                        System.out.print("\n Ingrese edad de la "+(i+1)+" Jirafa: ");
                        edad = data.nextInt();
                    }
                    while (edad < 0);

                    if (edad == 0 || edad == 1)
                    {
                        suma1++;
                        prom1 = (jf/suma1);
                    }
                    else if (edad > 1 && edad < 3)
                    {
                        suma2++;
                        prom2 = (jf/suma2);
                    }
                    else if (edad >= 3)
                    {
                        suma3++;
                        prom3 = (jf/suma3);
                    }
                }
                System.out.print("\n Se encuentran "+suma1+" Jirafa(s) con edades de 0 a 1 \n");
                System.out.print("\n Con un promedio de "+prom1+"\n");
                System.out.print("\n Se encuentran "+suma2+" Jirafa(s) con edades de 1 a 3 \n");
                System.out.print("\n Con un promedio de "+prom2+"\n");
                System.out.print("\n Se encuentran "+suma3+" Jirafa(s) con edades de 3 a mas \n");
                System.out.print("\n Con un promedio de "+prom3+"\n");
                break;
            }
            case "chimpances":
            {
                int cc = 40, suma1 = 0, suma2 = 0, suma3 = 0, edad = 0;
                float prom1 = 0, prom2 = 0, prom3 = 0;

                for (int i = 0 ; i < cc ; i++)
                {
                    do
                    {
                        System.out.print("\n Ingrese edad de la "+(i+1)+" Jirafa: ");
                        edad = data.nextInt();
                    }
                    while (edad < 0);

                    if (edad == 0 || edad == 1)
                    {
                        suma1++;
                        prom1 = (cc/suma1);
                    }
                    else if (edad > 1 && edad < 3)
                    {
                        suma2++;
                        prom2 = (cc/suma2);
                    }
                    else if (edad >= 3)
                    {
                        suma3++;
                        prom3 = (cc/suma3);
                    }
                }
                System.out.print("\n Se encuentran "+suma1+" chimpance(s) con edades de 0 a 1 \n");
                System.out.print("\n Con un promedio de "+prom1+"\n");
                System.out.print("\n Se encuentran "+suma2+" chimpance(s) con edades de 1 a 3 \n");
                System.out.print("\n Con un promedio de "+prom2+"\n");
                System.out.print("\n Se encuentran "+suma3+" chimpance(s) con edades de 3 a mas \n");
                System.out.print("\n Con un promedio de "+prom3+"\n");
                break;
            }
        }
    }
}