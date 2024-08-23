import java.util.Scanner;
public class MenuPrincipal {

    public void menuPrincipal(){
        Scanner leer = new Scanner(System.in);
        EmpleadoController empleadoController = new EmpleadoController();
        int opcion;
        boolean flag = true;

        do{
            System.out.println("Selecciona el numero de la opcion para ejecutarla");
            System.out.println("1. Ejercicio1");
            System.out.println("2. Ejercicio2");
            System.out.println("3. Ejercicio3");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    EmpleadoView empleadoView = new EmpleadoView();
                    empleadoView.Menu();
                    
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
