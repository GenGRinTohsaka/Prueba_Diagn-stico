public class ComputadorController {
    public void encenderComputadora(){
        Computadora computadora = new Computadora();
        computadora.encender();
    }

    public void desbloqueoUsuario(){
        Computadora computadora = new Computadora();
        computadora.encender("OLA123");
    }
}
