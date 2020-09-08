package ui;

public class UIMenu {
    public static void showMainMenu(){
        System.out.println("BIENVENIDO A ADMIN. DOCTORES");
        System.out.println("OPCIONES:");
        System.out.println("a) Acceder a doctores");
        System.out.println("b) Acceder a clientes");
        System.out.println("c) Acceder a supeadmin");
        System.out.println("d) Acceder a las citas");
        System.out.println("x) Salir del Main Menu");
    }
    public static void showAdminMenu(){
        System.out.println("ADMIN MENU");
        System.out.println("OPCIONES:");
        System.out.println("a) Crear Super User");
        System.out.println("b) Modificar Super User");
        System.out.println("c) Borrar Super User");
    }

    public static void showClientsMenu(){
        System.out.println("ADMIN MENU");
        System.out.println("OPCIONES:");
        System.out.println("a) Add a client");
        System.out.println("b) Delete a client");
        System.out.println("c) Modify Client");
    }


    public static void showClientsDates(){
        System.out.println("DATES MENU");
        System.out.println("OPCIONES");
        System.out.println("");
    }
}
