import java.util.Scanner;

// Ejercicio 40: Depreciacion Lineal Anual
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor inicial de la maquinaria: ");
        double valorInicial = sc.nextDouble();
        System.out.print("Ingresa el valor de rescate final: ");
        double valorRescate = sc.nextDouble();
        System.out.print("Ingresa los anios de vida util: ");
        int vidaUtil = sc.nextInt();

        double depreciacionAnual = ((valorInicial - valorRescate) / vidaUtil);

        System.out.println("Depreciacion anual: $" + depreciacionAnual);
        sc.close();
    }
}
