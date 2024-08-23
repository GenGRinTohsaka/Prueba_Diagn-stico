public class EmpleadoController {

    public void mostrarDesarrollador(){
        Desarrollador desarrollador = new Desarrollador("Java","Derian",17,5000);
        System.out.println("El Desarrollador se llama: " + desarrollador.getNombre() +"\n"+
                            "Tiene "+ desarrollador.getEdad()+ " años"+"\n" + 
                            "Programa en: "+ desarrollador.getLenguajeProgramacion()+"\n" + 
                            "Salario: Q" +desarrollador.getSalario());
    }

    public void mostrarTester(){
        Tester tester = new Tester("De usuario", "Apen", 17, 1000);
        System.out.println("El tester se llama: "+tester.getNombre()+"\n"+
                            "Hace pruebas de tipo: "+ tester.getTipoPruebas()+"\n"+
                            "Tiene "+tester.getEdad()+" años"+"\n"+
                            "Salario: Q"+tester.getSalario());
    }
    
    public void mostrarInstancias(){
        Tester tester = new Tester();
        Desarrollador desarrollador = new Desarrollador();
        System.out.println("Tester");
        tester.trabajar("KampekiMarket", "JUnit");
        tester.trabajar();
        System.out.println("");
        System.out.println("Desarrollador");
        desarrollador.trabajar("KampekiMarket");
        desarrollador.trabajar(2);
        desarrollador.trabajar();
        
    }
}
