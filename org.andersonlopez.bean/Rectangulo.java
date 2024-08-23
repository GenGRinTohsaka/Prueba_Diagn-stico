import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }

    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return calcularArea();
    }
}
