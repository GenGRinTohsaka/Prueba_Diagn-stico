import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode (callSuper = true)
public class Televisor extends Dispositivo{

    private int tamanoPantalla;

    @Override
    public void encender() {
        System.out.println("Se encendio el televisor");
    }

    public void encender(int volumen){
        System.out.println("Se ajusto el volumen del televisor a " + volumen);
    }
    
}
