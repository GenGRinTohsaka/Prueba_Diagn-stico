
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Telefono extends Dispositivo{
    
    private String tipo;

    @Override
    public void encender() {
        System.out.println("Se encencdio el telefono");
    }

    public void encender(String codigo) {
        System.out.println("Código de desbloqueo: " + codigo);
    }


}

