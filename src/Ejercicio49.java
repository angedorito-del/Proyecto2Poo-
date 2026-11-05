import java.util.Scanner;

// Ejercicio 49: Criterio de Beca Universitaria Integrada
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el promedio academico: ");
        double promedio = sc.nextDouble();
        System.out.print("Ingresa el ingreso familiar mensual: ");
        double ingreso = sc.nextDouble();
        System.out.print("Ingresa el numero de hermanos estudiantes: ");
        int hermanos = sc.nextInt();

        boolean otorgaBeca = ((promedio >= 9.5) || ((ingreso < 8000) && (hermanos > 2)));

        System.out.println("Se otorga la beca: " + otorgaBeca);
        sc.close();
    }
}
