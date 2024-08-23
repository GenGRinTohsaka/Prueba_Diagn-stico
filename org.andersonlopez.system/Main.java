import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        Ejecutora ejecurora = new Ejecutora();
        
        int opcion;

        do {
            System.out.println("Seleccione el menu:");
            System.out.println("1. menu 1 normal de opciones fijas");
            System.out.println("2. menu 2 con polimorfismos");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    operaciones.menu();
                    break;
                case 2:
                    ejecurora.menu2();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 3);

        }


}

