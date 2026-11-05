import java.util.Scanner;

// Ejercicio 38: Distribucion Proporcional de Ganancias
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la aportacion del Socio A: ");
        double socioA = sc.nextDouble();
        System.out.print("Ingresa la aportacion del Socio B: ");
        double socioB = sc.nextDouble();
        System.out.print("Ingresa la ganancia total: ");
        double gananciaTotal = sc.nextDouble();

        double gananciaA = (gananciaTotal * (socioA / (socioA + socioB)));

        System.out.println("Ganancia que corresponde al Socio A: $" + gananciaA);
        sc.close();
    }
}
