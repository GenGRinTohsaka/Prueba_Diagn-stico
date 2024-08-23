import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public void trabajar(String proyecto, String herramienta) {
        System.out.println("Testeando el proyecto " + proyecto + " con la herramienta " + herramienta);
    }
}
