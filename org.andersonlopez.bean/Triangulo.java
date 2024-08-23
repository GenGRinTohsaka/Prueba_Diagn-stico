import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Triangulo extends Forma {
    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }
}
