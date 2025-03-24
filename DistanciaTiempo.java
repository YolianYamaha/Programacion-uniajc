import java.util.Scanner;

public class DistanciaTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la distancia
        System.out.print("Ingrese la distancia: ");
        double distancia = scanner.nextDouble();

        // Evaluar la condición
        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingrese el tiempo: ");
            double tiempo = scanner.nextDouble();
            System.out.println("El valor de tiempo ingresado es: " + tiempo);
        } else {
            System.out.println("No se necesita ingresar tiempo, la condición no se cumple.");
        }

        scanner.close();
    }
}
