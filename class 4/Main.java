public class Main {
    public static void main(String[] args) {
        double A = 4; // Valor de A
        double B = 5; // Valor de B
        double C = 1; // Valor de C

        // Evaluación de la expresión B * A - B^2 / 4 * C
        double resultado = B * A - Math.pow(B, 2) / 4 * C;

        System.out.println("El resultado es: " + resultado);
    }
}
