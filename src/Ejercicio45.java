import java.util.Scanner;

// Ejercicio 45: Suma de Digitos de un Numero de 3 Cifras
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero de tres cifras: ");
        int numero = sc.nextInt();

        int centenas = (numero / 100);
        int decenas = ((numero / 10) % 10);
        int unidades = (numero % 10);
        int suma = (centenas + decenas + unidades);

        System.out.println("Centenas: " + centenas + ", Decenas: " + decenas + ", Unidades: " + unidades);
        System.out.println("Suma de los digitos: " + suma);
        sc.close();
    }
}
