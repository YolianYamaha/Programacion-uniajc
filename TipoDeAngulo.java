import java.util.Scanner;

public class TipoDeAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un ángulo
        System.out.print("Ingrese el valor del ángulo en grados: ");
        int angulo = scanner.nextInt();

        // Evaluar si el ángulo es recto
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto.");
        } else {
            System.out.println("El ángulo no es un ángulo recto.");
        }

        scanner.close();
    }
}
