import java.util.Scanner;

// Ejercicio 25: Aprobacion por Examen A O Examen B
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la nota del Examen 1: ");
        double examen1 = sc.nextDouble();
        System.out.print("Ingresa la nota del Examen 2: ");
        double examen2 = sc.nextDouble();

        boolean aprueba = ((examen1 >= 80) || (examen2 >= 80));

        System.out.println("Aprueba la certificacion: " + aprueba);
        sc.close();
    }
}
