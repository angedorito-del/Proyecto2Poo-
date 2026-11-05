import java.util.Scanner;

// Ejercicio 16: Evaluacion de Sobrepeso por IMC
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingresa la estatura en metros: ");
        double estatura = sc.nextDouble();

        double imc = (peso / (estatura * estatura));
        boolean sobrepeso = (imc >= 25.0);

        System.out.println("IMC: " + imc);
        System.out.println("Tiene sobrepeso: " + sobrepeso);
        sc.close();
    }
}
