import lombok.Data;

@Data
abstract class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public abstract void trabajar();
    
    void trabajar(int horas){
        System.out.println("El empleado trabajo: " + horas);
    }
    
    public void trabajar(String proyecto){
        System.out.println("Trabajando proyecto: " + proyecto);
    }
}
