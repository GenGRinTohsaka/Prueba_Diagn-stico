public class TelefonoController {

    public void desbloqueo(){
        Telefono telefono = new Telefono();
        telefono.encender("123456a");
    }

    public void encenderTelefono(){
        Telefono telefono = new Telefono();
        telefono.encender();
    }

}
