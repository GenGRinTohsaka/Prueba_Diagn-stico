import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

public class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }
}
