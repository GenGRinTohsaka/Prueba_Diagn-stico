import lombok.Data;

@Data
abstract class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    abstract void trabajar();

    void trabajar(int horas){}
}
