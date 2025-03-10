import java.util.Scanner;

public class DulceAlgoritmo {
    public static void main(String[] args) {
        // Definimos los costos y parámetros
        final double COSTO_MATERIA_PRIMA = 2.50;
        final double COSTO_EMPAQUE = 0.50;
        final double GANANCIA_PORCENTAJE = 0.30;
        final int BARRAS_POR_CAJA = 10;

        // Entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de barras producidas hoy: ");
        int nBarras = scanner.nextInt();
        scanner.close();

        // Cálculo del costo total de producción por barra
        double costoTotalPorBarra = COSTO_MATERIA_PRIMA + COSTO_EMPAQUE;
        double costoTotalProduccion = costoTotalPorBarra * nBarras;

        // Cálculo del precio de venta
        double precioVentaPorBarra = costoTotalPorBarra * (1 + GANANCIA_PORCENTAJE);

        // Cálculo del ingreso total
        double ingresoTotal = precioVentaPorBarra * nBarras;

        // Cálculo del empaque
        int cajasLlenas = nBarras / BARRAS_POR_CAJA;
        int barrasSobrantes = nBarras % BARRAS_POR_CAJA;

        // Resultados
        System.out.printf("Costo total de producción: $%.2f%n", costoTotalProduccion);
        System.out.printf("Precio de venta por barra: $%.2f%n", precioVentaPorBarra);
        System.out.printf("Ingreso total del día: $%.2f%n", ingresoTotal);
        System.out.printf("Cajas llenas: %d%n", cajasLlenas);
        System.out.printf("Barras sobrantes: %d%n", barrasSobrantes);
    }
}