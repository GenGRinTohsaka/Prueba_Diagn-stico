import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Desarrollador extends Empleado{
    
    private String lenguajeProgramacion;

    public Desarrollador(String lenguajeProgramacion,String nombre,int edad,double salario){
        super(nombre,edad,salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    @Override
    public void trabajar() {
        System.out.println("Desarrollador trabajando en el programa");
    }

    @Override
    public void trabajar(String proyecto) {
        System.out.println("Programador trabajando en el proyecto: " + proyecto);
    }
}
