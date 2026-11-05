import java.util.Scanner;

// Ejercicio 27: Acceso Preferencial a Evento
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la edad del asistente: ");
        int edad = sc.nextInt();
        System.out.print("Cuenta con pase VIP? (1 = si, 0 = no): ");
        int paseVip = sc.nextInt();

        boolean accesoPreferencial = ((edad < 12) || (paseVip == 1));

        System.out.println("Tiene acceso preferencial: " + accesoPreferencial);
        sc.close();
    }
}
