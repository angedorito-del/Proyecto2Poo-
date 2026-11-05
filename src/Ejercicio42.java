import java.util.Scanner;

// Ejercicio 42: Deteccion de Digitos Iguales en Numero de 2 Cifras
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero de dos digitos (10 a 99): ");
        int numero = sc.nextInt();

        int decenas = (numero / 10);
        int unidades = (numero % 10);
        boolean digitosIguales = (decenas == unidades);

        System.out.println("Decenas: " + decenas + ", Unidades: " + unidades);
        System.out.println("Ambos digitos son iguales: " + digitosIguales);
        sc.close();
    }
}
