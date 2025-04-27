import java.util.Scanner;

public class Circulo {
    public Circulo(double r) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular la longitud de la circunferencia
        double longitud = 2 * Math.PI * radio;

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar los resultados
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }

    public String calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    public String calcularPerimetro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPerimetro'");
    }
}