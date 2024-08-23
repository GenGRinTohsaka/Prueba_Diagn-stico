import lombok.Data;

@Data
public class Desarrollador extends Empleado{
    

    private String lenguajeProgramacion;


    

    @Override
    public void trabajar() {
        System.out.println("Desarrollador trabajando en el programa");
    }

    
    @Override
    public void trabajar(String proyecto) {
        System.out.println("Programador trabajando en el proyecto: " + proyecto);
    }
}
