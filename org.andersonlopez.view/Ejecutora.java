public class Ejecutora {
    
    public void menu2() {
        // Crear instancias directas
        Circulo circulo = new Circulo("Rojo", 5);
        Triangulo triangulo = new Triangulo("Verde", 4, 3);
        Cuadrado cuadrado = new Cuadrado("Amarillo", 4);
        Rectangulo rectangulo = new Rectangulo("Azul", 6, 2);

        // Probar el cálculo del área con ajuste
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del círculo con ajuste: " + circulo.calcularArea(10));

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del triángulo con ajuste: " + triangulo.calcularArea(5));

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del cuadrado con ajuste: " + cuadrado.calcularArea(8));

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del rectángulo con ajuste: " + rectangulo.calcularArea(12));

        // Prueba de polimorfismo por sustitución
        Forma forma;
        
        forma = new Circulo("Naranja", 7);
        System.out.println("Área del círculo (con polimorfismo): " + forma.calcularArea());
        System.out.println("Área del círculo con ajuste (con polimorfismo): " + forma.calcularArea(15));

        forma = new Triangulo("Morado", 5, 4);
        System.out.println("Área del triángulo (con polimorfismo): " + forma.calcularArea());
        System.out.println("Área del triángulo con ajuste (con polimorfismo): " + forma.calcularArea(7));

        forma = new Cuadrado("Cyan", 5);
        System.out.println("Área del cuadrado (con polimorfismo): " + forma.calcularArea());
        System.out.println("Área del cuadrado con ajuste (con polimorfismo): " + forma.calcularArea(10));

        forma = new Rectangulo("Magenta", 7, 3);
        System.out.println("Área del rectángulo (con polimorfismo): " + forma.calcularArea());
        System.out.println("Área del rectángulo con ajuste (con polimorfismo): " + forma.calcularArea(20));
    }
}
