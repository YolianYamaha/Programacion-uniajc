public class Circulo {
 
    // Atributos
    private double radio;
 
    // Constructor de la clase:Nos permite inicializar la clase
    // Se llama igual que la clase
    public Circulo(double radio) {
        this.radio = radio; // This: es una autoreferencia al atributo de la clase
    }
 
    // Metodos
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
 
    public double calcularArea() {
        return Math.PI * (radio * radio); // Math.PI * Math.pow (radio,2)
    }
}
 