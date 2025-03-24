import java.util.Scanner;

public class TipoDeAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el ángulo al usuario
        System.out.print("Introduce un ángulo en grados: ");
        double angulo = scanner.nextDouble();

        // Determinar el tipo de ángulo
        if (angulo < 90) {
            System.out.println("El ángulo es agudo.");
        } else if (angulo == 90) {
            System.out.println("El ángulo es recto.");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("El ángulo es obtuso.");
        } else if (angulo == 180) {
            System.out.println("El ángulo es llano.");
        } else {
            System.out.println("El ángulo es mayor a 180 grados.");
        }

        scanner.close();
    }
}
