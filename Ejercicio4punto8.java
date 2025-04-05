import java.util.Scanner;

public class Ejercicio4punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Verificar si uno es divisor del otro
        if (num1 % num2 == 0) {
            System.out.println(num2 + " es divisor de " + num1);
        } else if (num2 % num1 == 0) {
            System.out.println(num1 + " es divisor de " + num2);
        } else {
            System.out.println("Ninguno de los dos números es divisor del otro.");
        }

        scanner.close();
    }
}
