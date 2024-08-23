import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Tester extends Empleado{

    private String tipoPruebas;

    @Override
    public void trabajar() {
        System.out.println("Haciendo pruebas");
    }

    @Override
    public void trabajar(String proyecto, String herramienta) {
        System.out.println("Testeando el proyecto " + proyecto + " con la herramienta " + herramienta);
    }
    
}
