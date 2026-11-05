import java.util.Scanner;

// Ejercicio 50: Verificacion de Ecuacion de Circulo en el Origen
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la coordenada x: ");
        double x = sc.nextDouble();
        System.out.print("Ingresa la coordenada y: ");
        double y = sc.nextDouble();
        System.out.print("Ingresa el radio r: ");
        double r = sc.nextDouble();

        boolean dentroOSobre = (((x * x) + (y * y)) <= (r * r));

        System.out.println("El punto esta sobre o dentro de la circunferencia: " + dentroOSobre);
        sc.close();
    }
}
