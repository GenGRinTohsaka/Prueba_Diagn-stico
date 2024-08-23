import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class Tester extends Empleado{

    private String tipoPruebas;

    public Tester(String tipoPruebas,String nombre,int edad,double salario){
        super(nombre,edad,salario);
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public void trabajar() {
        System.out.println("Haciendo pruebas");
    }

    @Override
    public void trabajar(String proyecto, String herramienta) {
        System.out.println("Testeando el proyecto " + proyecto + " con la herramienta " + herramienta);
    }
    
}
