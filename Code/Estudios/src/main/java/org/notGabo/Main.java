package org.notGabo;

import org.notGabo.Controlador.LectorArchivos;
import org.notGabo.Vista.OpcionesMenu;
import org.notGabo.Vista.Entradas;

public class Main {
    public static void main(String[] args) {
        OpcionesMenu menu = new OpcionesMenu();
        Entradas entradas = new Entradas();
        LectorArchivos lectorArchivos = new LectorArchivos();
        String ruta = "";
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
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                case 1:
                    ruta = "1. Tipos de datos fundamentales (Primitivos).md";
                    break;
                case 2:
                    ruta = "2. Tipos de referencias, opcionales.md";
                    break;
                case 3:
                    ruta = "3. Constantes, estáticos, y Enums.md";
                    break;
                case 4:
                    ruta = "4. Métodos, parámetros y propiedades.md";
                    break;
                case 5:
                    ruta = "5. Chars, strings, y trabajos con textos.md";
                    break;
                case 6:
                    ruta = "6. Conversiones de tipos, encajamiento y desencajamiento.md";
                    break;
                case 7:
                    ruta = "7. Interfaces, interfaces predeterminadas.md";
                    break;
                case 8:
                    ruta = "8. Manejo de errores y errores básicos.md";
                    break;
                case 9:
                    ruta = "9. Administración de ciclo de vida de objetos.md";
                    break;
                case 10:
                    ruta = "10. Organización de ciclos.md";
                    break;
                case 11:
                    ruta = "11. Reflexión.md";
                    break;
                case 12:
                    ruta = "12. Utilidades JDK.md";
                    break;
                case 13:
                    ruta = "13. JVM Cargadores de clases, reflexión, JARs y Módulos, Memoria, Debugging (remoto), Propiedades JVM.md";
                    break;
                default:
                    menu.limpiarConsola();
                    System.out.println("Opción inválida. Por favor, seleccione una opción del menú.");
                    break;
            }
            if (opcion >= 1 && opcion <= 13) {
                String contenido = lectorArchivos.MarkdownToSout(ruta);
                System.out.println(contenido);
                entradas.ValidarEnter();
            }


            menu.limpiarConsola();
        } while(opcion != 0);
    }
}