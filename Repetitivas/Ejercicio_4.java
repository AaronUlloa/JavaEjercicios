import java.util.Scanner;

public class Ejercicio_4 
{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int n, nota1 = 0, suma = 0;

        do
        {
            System.out.print("\n Ingrese nota del alumno: ");
            n = data.nextInt();

            if (n >= 7)
            {
                nota1++;
            }
            else if (n < 0 && n < 7)
            {
                suma++;
            }
        }
        while (n != 0);

        System.out.print("\n \t"+nota1+" Alumnos Tienen Notas >= a 7 \n");
        System.out.print("\n \t"+suma+" Alumnos Tienes Notas < 7 \n");
    }    
}