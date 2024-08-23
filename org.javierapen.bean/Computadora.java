import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Computadora extends Dispositivo{

    private String sistemaOperativo;

    @Override
    public void encender() {
        System.out.println("Se encendio la computadora");
    }

    public void encender(String clave){
        System.out.println("La clave " + clave + " es correcta");
    }

    
}
