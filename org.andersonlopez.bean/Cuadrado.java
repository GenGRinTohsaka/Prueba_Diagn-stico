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

    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return calcularArea();
    }
}
