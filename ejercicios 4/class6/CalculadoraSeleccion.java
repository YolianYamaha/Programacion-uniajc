import java.util.Scanner;

public class CalculadoraSeleccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar el código de selección
        System.out.println("Selecciona la operación:");
        System.out.println("1 - Suma");
        System.out.println("2 - Multiplicación");
        System.out.println("3 - División");
        System.out.print("Introduce el código de selección (1-3): ");
        int codigo = scanner.nextInt();

        // Ejecutar la operación correspondiente
        double resultado;

        if (codigo == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado de la suma: " + resultado);
        } else if (codigo == 2) {
            resultado = num1 * num2;
            System.out.println("Resultado de la multiplicación: " + resultado);
        } else if (codigo == 3) {
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("Error: No se puede dividir por cero.");
            }
        } else {
            System.out.println("Código inválido. Debes ingresar 1, 2 o 3.");
        }

        scanner.close();
    }
}
