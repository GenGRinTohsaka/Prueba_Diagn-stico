import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Telefono extends Dispositivo{
    
    private String tipo;

    @Override
    public void encender() {
        System.out.println("Se encencdio el telefono");
    }

    public void encender(String codigo){
        System.out.println("El codigo " + codigo + " es valido, desbloqueo el telefono");
    }

    

}

