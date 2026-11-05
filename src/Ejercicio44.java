import java.util.Scanner;

// Ejercicio 44: Distancia de Manzana a Frontera de Matriz (Primer Cuadrante)
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la coordenada x: ");
        double x = sc.nextDouble();
        System.out.print("Ingresa la coordenada y: ");
        double y = sc.nextDouble();

        boolean primerCuadrante = ((x > 0) && (y > 0));

        System.out.println("El punto esta en el primer cuadrante: " + primerCuadrante);
        sc.close();
    }
}
