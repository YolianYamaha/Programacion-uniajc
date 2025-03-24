import java.util.Scanner;

public class NumeroCentral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tres números al usuario
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        // Determinar el número central
        int central;
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            central = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            central = num2;
        } else {
            central = num3;
        }

        // Imprimir el resultado
        System.out.println("El número central es: " + central);

        scanner.close();
    }
}
