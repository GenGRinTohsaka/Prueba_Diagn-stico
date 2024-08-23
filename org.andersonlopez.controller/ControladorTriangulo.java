public class ControladorTriangulo implements ControladorForma {
    private Triangulo triangulo;

    public ControladorTriangulo(String color, double base, double altura) {
        this.triangulo = new Triangulo(color, base, altura);
    }

    @Override
    public double calcularArea() {
        return triangulo.calcularArea();
    }

    @Override
    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return triangulo.calcularArea();
    }

    @Override
    public double calcularArea(double ajuste) {
        return triangulo.calcularArea(ajuste);
    }
}
