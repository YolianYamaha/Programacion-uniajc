import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicitar la operación deseada
        System.out.print("Selecciona la operación (+, -, *, /): ");
        char seleccionOp = scanner.next().charAt(0);

        double resultado;

        // Determinar la operación a realizar
        switch (seleccionOp) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida. Usa +, -, * o /.");
        }

        scanner.close();
    }
}
