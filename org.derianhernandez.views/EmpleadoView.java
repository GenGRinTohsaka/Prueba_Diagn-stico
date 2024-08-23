import java.util.Scanner;
public class EmpleadoView {

    public void Menu(){
        Scanner leer = new Scanner(System.in);
        EmpleadoController empleadoController = new EmpleadoController();
        int opcion;
        boolean flag = true;

        do{
            System.out.println("Selecciona el numero de la opcion para ejecutarla");
            System.out.println("1. Empleados");
            System.out.println("2. Instancias");
            System.out.println("3. Regresar");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    empleadoController.mostrarDesarrollador();
                    System.out.println(" ");
                    empleadoController.mostrarTester();
                    flag = false;
                    break;
            
                case 2:
                    System.out.println("Instancias");
                    System.out.println("");
                    empleadoController.mostrarInstancias();
                    flag = false;
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Eleccion sin valor");
                    break;
            }

        }while(flag!=false);

        
        
    }
}
