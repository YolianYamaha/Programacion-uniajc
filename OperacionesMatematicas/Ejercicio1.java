public class Ejercicio1 {
    public static void main(String[] args) {
        OperacionesMatematicas op = new OperacionesMatematicas();

        double a = 10.5;
        double b = 3.25;

        double suma = op.sumar(a, b);
        double resta = op.restar(a, b);
        double multiplicacion = op.multiplicar(a, b);
        double division = op.dividir(a, b);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
