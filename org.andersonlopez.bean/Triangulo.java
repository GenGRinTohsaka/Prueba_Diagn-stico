import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Triangulo extends Forma {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return calcularArea();
    }
}
