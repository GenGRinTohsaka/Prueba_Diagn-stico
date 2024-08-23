import lombok.Data;

@Data
public abstract class Forma {

    private String color;

    public Forma(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return calcularArea(); 
    }
}

