
import lombok.Data;


@Data
public abstract class Dispositivo {

    private String marca;
    private String modelo;
    private int anio;

    public abstract void encender();

    public void encender(int voltaje){
        System.out.println("Se encendio el dispositivo con voltaje: "+voltaje+ " W");
    }

    public void mostrarInformacion(){
        System.out.println("Marca " + marca );
        System.out.println("Modelo " + modelo);
        System.out.println("Año " + anio);
    }

}
