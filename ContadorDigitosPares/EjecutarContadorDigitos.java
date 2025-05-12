public class EjecutarContadorDigitos {
    public static void main(String[] args) {
        // Escenario 1
        System.out.println("-------------- Escenario 1 -----------------------------");
        int numero1 = 48273;
        ContadorDigitosPares contador1 = new ContadorDigitosPares(numero1);
        System.out.println("Número: " + numero1);
        System.out.println("Cantidad de dígitos pares: " + contador1.contarDigitosPares());
    }
}