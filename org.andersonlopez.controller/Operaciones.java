import java.util.Scanner;

public class Operaciones {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Seleccione la figura para calcular el área:");
            System.out.println("1. Círculo");
            System.out.println("2. Triángulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Rectángulo");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();

            System.out.println();
            System.out.println();
                        
            switch(opcion) {
                case 1:
                    Circulo circulo = new Circulo();
                    circulo.setRadio(5);
                    System.out.println("Área del círculo: " + circulo.calcularArea());
                    System.out.println("Área del círculo con ajuste: " + circulo.calcularArea(10));
                    break;
                case 2:
                    Triangulo triangulo = new Triangulo();
                    triangulo.setBase(4);
                    triangulo.setAltura(3);
                    System.out.println("Área del triángulo: " + triangulo.calcularArea());
                    System.out.println("Área del triángulo con ajuste: " + triangulo.calcularArea(5));
                    break;
                case 3:
                    Forma forma = new Cuadrado();
                    ((Cuadrado) forma).setLado(4);
                    System.out.println("Área del cuadrado: " + forma.calcularArea());
                    System.out.println("Área del cuadrado con ajuste: " + forma.calcularArea(8));
                    break;
                case 4:
                    forma = new Rectangulo();
                    ((Rectangulo) forma).setLargo(6);
                    ((Rectangulo) forma).setAncho(2);
                    System.out.println("Área del rectángulo: " + forma.calcularArea());
                    System.out.println("Área del rectángulo con ajuste: " + forma.calcularArea(12));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println();
            System.out.println();

        } while (opcion != 5);
        
    }

}
