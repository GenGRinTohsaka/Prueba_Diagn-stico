import lombok.Data;

@Data
public abstract class Forma {

    protected String color;

    public abstract double calcularArea();

    public double calcularArea(String mensaje) { 
        System.out.println(mensaje);
        return calcularArea();
    }

    public abstract double calcularArea(double ajuste); 
}

