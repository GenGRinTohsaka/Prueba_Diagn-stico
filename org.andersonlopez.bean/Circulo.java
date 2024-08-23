import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Circulo extends Forma{
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }
}
