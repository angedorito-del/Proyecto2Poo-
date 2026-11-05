import java.util.Scanner;

// Ejercicio 39: Calificacion de Tarjeta de Credito Gold
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el ingreso anual: ");
        double ingresoAnual = sc.nextDouble();
        System.out.print("Ingresa el puntaje crediticio: ");
        int puntaje = sc.nextInt();

        boolean calificaGold = ((ingresoAnual >= 300000) && (puntaje > 700));

        System.out.println("Califica para tarjeta Gold: " + calificaGold);
        sc.close();
    }
}
