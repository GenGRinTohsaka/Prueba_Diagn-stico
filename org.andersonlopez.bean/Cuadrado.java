import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Cuadrado extends Forma {
    private double lado;

    // Constructor
    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
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
