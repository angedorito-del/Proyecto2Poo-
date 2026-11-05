import java.util.Scanner;

// Ejercicio 29: Rango de Presion Arterial Normal
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la presion sistolica (mmHg): ");
        double presion = sc.nextDouble();

        boolean presionNormal = ((presion >= 90) && (presion <= 120));

        System.out.println("Presion en rango saludable: " + presionNormal);
        sc.close();
    }
}
