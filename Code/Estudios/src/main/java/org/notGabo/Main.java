package org.notGabo;

import org.notGabo.Vista.OpcionesMenu;
import org.notGabo.Vista.Entradas;

public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        OpcionesMenu menu = new OpcionesMenu();
        Entradas entradas = new Entradas();
        int opcion;

        menu.limpiarConsola();
        do {
            opcion = 999;
            menu.mostrarMenu();
            try{
                opcion = entradas.ValidarEntradaEntero();
            } catch (Exception e){
                menu.limpiarConsola();
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
            if (opcion == 999){
                continue;
            }
            if (opcion < 0 || opcion > 13 ) {
                menu.limpiarConsola();
                System.out.println("Opción inválida. Por favor, seleccione una opción del menú.");
                continue;
            }
            switch(opcion){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                default:
                    menu.limpiarConsola();
                    System.out.println("Opción inválida. Por favor, seleccione una opción del menú.");
                    break;
            }


            menu.limpiarConsola();
        } while(opcion != 0);
    }
}