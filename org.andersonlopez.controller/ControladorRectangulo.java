public class ControladorRectangulo implements ControladorForma {
    private Rectangulo rectangulo;

    public ControladorRectangulo(String color, double largo, double ancho) {
        this.rectangulo = new Rectangulo(color, largo, ancho);
    }

    @Override
    public double calcularArea() {
        return rectangulo.calcularArea();
    }

    @Override
    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return rectangulo.calcularArea();
    }

    @Override
    public double calcularArea(double ajuste) {
        return rectangulo.calcularArea(ajuste);
    }
}
