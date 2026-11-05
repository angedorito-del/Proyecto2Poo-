import java.util.Scanner;

// Ejercicio 37: Calculo de Utilidad Comercial
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el precio de costo: ");
        double costo = sc.nextDouble();
        System.out.print("Ingresa el precio de venta al publico: ");
        double venta = sc.nextDouble();

        double margen = ((venta - costo) / costo);
        boolean margenSuficiente = (margen >= 0.30);

        System.out.println("Margen de ganancia: " + (margen * 100) + "%");
        System.out.println("El margen es mayor o igual al 30%: " + margenSuficiente);
        sc.close();
    }
}
