import java.util.Scanner;

// Ejercicio 2: Conversion Financiera con Comision
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en dolares: ");
        double dolares = sc.nextDouble();
        System.out.print("Ingresa el tipo de cambio a pesos: ");
        double tipoCambio = sc.nextDouble();
        System.out.print("Ingresa el porcentaje de comision (ej. 2.5): ");
        double comision = sc.nextDouble();

        double totalNeto = ((dolares * tipoCambio) - ((dolares * tipoCambio) * (comision / 100)));

        System.out.println("Total neto en pesos: $" + totalNeto);
        sc.close();
    }
}
