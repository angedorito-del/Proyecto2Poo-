import java.util.Scanner;

// Ejercicio 43: Verificacion de Bisiesto con Regla Completa
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un anio: ");
        int anio = sc.nextInt();

        boolean bisiesto = ((((anio % 4) == 0) && ((anio % 100) != 0)) || ((anio % 400) == 0));

        System.out.println("El anio es bisiesto: " + bisiesto);
        sc.close();
    }
}
