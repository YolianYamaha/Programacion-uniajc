import java.util.Scanner;

public class CondicionXYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valores para x, y y z
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();
        
        System.out.print("Ingrese el valor de y: ");
        int y = scanner.nextInt();
        
        System.out.print("Ingrese el valor de z: ");
        int z = scanner.nextInt();

        // Evaluar la condición
        if (x > y && z < 20) {
            System.out.print("Ingrese el valor de p: ");
            int p = scanner.nextInt();
            System.out.println("El valor ingresado para p es: " + p);
        } else {
            System.out.println("No se requiere ingresar un valor para p.");
        }

        scanner.close();
    }
}
