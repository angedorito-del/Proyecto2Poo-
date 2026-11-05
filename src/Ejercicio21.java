import java.util.Scanner;

// Ejercicio 21: Pertenencia a Rango Abierto (15, 85)
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un valor decimal x: ");
        double x = sc.nextDouble();

        boolean enRango = ((x > 15) && (x < 85));

        System.out.println("x esta dentro de (15, 85): " + enRango);
        sc.close();
    }
}
