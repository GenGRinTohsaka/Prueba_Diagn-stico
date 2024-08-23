import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)

public class Cuadrado extends Forma {
    private double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }
}
