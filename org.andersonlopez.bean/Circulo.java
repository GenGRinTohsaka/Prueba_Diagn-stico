import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Circulo extends Forma {
    private double radio;

    // Constructor
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
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
