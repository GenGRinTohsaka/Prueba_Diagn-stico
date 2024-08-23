public class TelevisorController {

    public void modificarVolumen(){
        Televisor televisor = new Televisor();
        televisor.encender(50);
    }

    public void encenderTelevisor(){
        Televisor televisor = new Televisor();
        televisor.encender();
    }
}
