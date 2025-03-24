import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        // Verificar si el número es negativo
        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo en los números reales.");
        } else {
            double raiz = Math.sqrt(numero); // Calcular la raíz cuadrada
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        }

        scanner.close();
    }
}
