import java.util.Scanner;

// Ejercicio 3: Distancia entre Dos Puntos (Cuadrado de la Distancia)
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingresa y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Ingresa x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingresa y2: ");
        double y2 = sc.nextDouble();

        double distanciaCuadrada = (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println("Cuadrado de la distancia: " + distanciaCuadrada);
        sc.close();
    }
}
