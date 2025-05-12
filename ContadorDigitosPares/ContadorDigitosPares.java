public class ContadorDigitosPares {
    private int numero;

    // Constructor
    public ContadorDigitosPares(int numero) {
        this.numero = numero;
    }

    // Método para contar los dígitos pares
    public int contarDigitosPares() {
        int num = this.numero;
        int contador = 0;

        while (num != 0) {
            int digito = num % 10;

            if (digito % 2 == 0) {
                contador++;
            }

            num = num / 10;
        }

        return contador;
    }
}