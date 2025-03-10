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

        // Resultados con println
        System.out.println("Costo total de producción: $" + String.format("%.2f", costoTotalProduccion));
        System.out.println("Precio de venta por barra: $" + String.format("%.2f", precioVentaPorBarra));
        System.out.println("Ingreso total del día: $" + String.format("%.2f", ingresoTotal));
        System.out.println("Cajas llenas: " + cajasLlenas);
        System.out.println("Barras sobrantes: " + barrasSobrantes);
    }
}
