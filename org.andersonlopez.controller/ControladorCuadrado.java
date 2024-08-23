public class ControladorCuadrado implements ControladorForma {
    private Cuadrado cuadrado;

    public ControladorCuadrado(String color, double lado) {
        this.cuadrado = new Cuadrado(color, lado);
    }

    @Override
    public double calcularArea() {
        return cuadrado.calcularArea();
    }

    @Override
    public double calcularArea(String mensaje) {
        System.out.println(mensaje);
        return cuadrado.calcularArea();
    }

    @Override
    public double calcularArea(double ajuste) {
        return cuadrado.calcularArea(ajuste);
    }
}
