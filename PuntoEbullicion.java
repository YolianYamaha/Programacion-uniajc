import java.util.Scanner;

public class PuntoEbullicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la temperatura
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperatura = scanner.nextDouble();

        // Evaluar la condición
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullición del agua.");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua.");
        }

        scanner.close();
    }
}
