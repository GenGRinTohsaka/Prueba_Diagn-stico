public class ControladorCirculo implements ControladorForma {
    private Circulo circulo;

    public ControladorCirculo(String color, double radio) {
        this.circulo = new Circulo(color, radio);
    }

    @Override
    public double calcularArea() {
        return circulo.calcularArea();
    }

    @Override
    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return circulo.calcularArea();
    }
}
