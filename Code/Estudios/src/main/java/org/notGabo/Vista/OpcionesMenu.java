package org.notGabo.Vista;

import static org.notGabo.Vista.Colores.*;

public class OpcionesMenu {
    public void mostrarMenu(){
        System.out.println(PURPURA+"\n--- Menú Estudios exadel---"+RESETEAR);
        System.out.println(AZUL+"1. Tipos de datos fundamentales"+RESETEAR);
        System.out.println(AZUL+"2. Tipos de referencias, opcionales"+RESETEAR);
        System.out.println(AZUL+"3. Constantes, estaticos, y enums"+RESETEAR);
        System.out.println(AZUL+"5. Metodos, parametros y propiedades"+RESETEAR);
        System.out.println(AZUL+"6. Char, strings, y trabajos con textos"+RESETEAR);
        System.out.println(AZUL+"7. Conversiones de tipo, encajamiento y desencajamiento"+RESETEAR);
        System.out.println(AZUL+"8. Interfaces y interfaces predeterminadas"+RESETEAR);
        System.out.println(AZUL+"9. Manejo de errores y errores basicos"+RESETEAR);
        System.out.println(AZUL+"10. Organizacion de ciclos"+RESETEAR);
        System.out.println(AZUL+"11. Reflexion"+RESETEAR);
        System.out.println(AZUL+"12. Utilidades JDK"+RESETEAR);
        System.out.println(AZUL+"13. JVM cargadores de clase, reflexion, JARs, modulos, memoria, debugging remoto, propiedades JVM"+RESETEAR);
        System.out.println(VERDE+"Seleccione una opción:"+RESETEAR);
    }


    public void limpiarConsola() {
        // Fuente: https://intellipaat.com/blog/java-clear-the-console/
        String os = System.getProperty("os.name");
        try {
            if (os.startsWith("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Linux/Mac
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

        } catch (Exception e) {
            System.out.println("Error limpiando la consola: " + e.getMessage());

        }
    }
}
