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

            ControladorForma controlador = null;

            switch(opcion) {
                case 1:
                    controlador = new ControladorCirculo("Rojo", 5);
                    break;
                case 2:
                    controlador = new ControladorTriangulo("Verde", 4, 3);
                    break;
                case 3:
                    controlador = new ControladorCuadrado("Amarillo", 4);
                    break;
                case 4:
                    controlador = new ControladorRectangulo("Azul", 6, 2);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (controlador != null) {
                System.out.println("Área calculada: " + controlador.calcularArea());
                System.out.println("Área con ajuste: " + controlador.calcularArea("Calculando área con ajuste:"));
            }

            System.out.println();
            System.out.println();

        } while (opcion != 5);

    }

    public static void main(String[] args) {
        new Operaciones().menu();
    }
}
