public class Main {
    public static void main(String[] args) {
        OperacionesMatematicas op = new OperacionesMatematicas();

        double suma = op.sumar(10, 5);
        double resta = op.restar(10, 5);
        double multiplicacion = op.multiplicar(10, 5);
        double division = op.dividir(10, 0); // mostrará error por división por cero

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
