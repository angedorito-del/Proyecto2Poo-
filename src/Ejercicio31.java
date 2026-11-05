import java.util.Scanner;

// Ejercicio 31: Descuento por Compra Voluminosa
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de unidades compradas: ");
        int unidades = sc.nextInt();
        System.out.print("Ingresa el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        double costoTotal = (unidades * precioUnitario);
        boolean aplicaDescuento = ((unidades > 50) && (costoTotal > 5000));

        System.out.println("Costo total: $" + costoTotal);
        System.out.println("Aplica descuento por volumen: " + aplicaDescuento);
        sc.close();
    }
}
