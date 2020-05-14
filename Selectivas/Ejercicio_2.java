import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int dia, mes, an, grado, edad = 0;
        String grupo = "", entrenamiento = "";
        float promed = 0;

        //Pedir Datos
        do
        {
            System.out.print("\n Ingrese Dia de nacimiento: ");
            dia = data.nextInt();
            System.out.print("\n Ingrese Mes de nacimiento: ");
            mes = data.nextInt();
            System.out.print("\n Ingrese Año de nacimiento: ");
            an = data.nextInt();
        }
        while (dia < 1 || dia > 30 && mes < 1 || mes > 12 && an >= 2019 || an <= 1940);
        edad = (2020 - an);

        //Logico
        if (edad < 18)
        {
            System.err.print("\n Tu edad es de: "+edad+"\n");
            System.out.print("\n Lo sentimos, no podras ser parte del equipo :( --- \n");
        }
        else if (edad >= 18)
        {
            System.err.print("\n Tu edad es de: "+edad+"\n");
            System.out.print("\n Excelente, podras ser parte del equipo de INFORMATICA :) --- \n");

            //Mas datos
            do
            {
                System.err.print("\n Favor ingrese el grado escolar que cursa: ");
                grado = data.nextInt();
            }
            while (grado < 1 || grado > 11);

            System.out.print("\n Grupo escolar: ");
            grupo = data.next();

            do
            {
                System.err.print("\n Ingrese Promedio del semestre que Cursa: ");
                promed = data.nextFloat();
            }
            while(promed < 0 || promed > 100);

            if (promed < 70)
            {
                System.out.print("\n Tu promedio es de: "+promed+"\n");
                System.out.print("\n Lo sentimos, no podras ser parte del equipo tu bajo promedio :( --- \n");
            }
            else 
            {
                System.out.print("\n Horario que prefiere de entrenamiento: ");
                entrenamiento = data.next();
            }
        }

    }
}