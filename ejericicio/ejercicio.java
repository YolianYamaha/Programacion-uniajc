import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        // Solicitar la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular la superficie usando la fórmula S = (base * altura) / 2
        double superficie = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println("La superficie del triángulo es: " + superficie);

        // Cerrar el Scanner
        scanner.close();
    }
}