import java.util.Scanner;

// Ejercicio 34: Aprobacion de Prestamo Hipotecario
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el sueldo mensual: ");
        double sueldo = sc.nextDouble();
        System.out.print("Ingresa los anios de antiguedad laboral: ");
        int antiguedad = sc.nextInt();
        System.out.print("Ingresa las deudas actuales: ");
        double deudas = sc.nextDouble();

        boolean aprobado = ((sueldo > 15000) && (antiguedad > 3) && (deudas < 5000));

        System.out.println("Prestamo aprobado: " + aprobado);
        sc.close();
    }
}
