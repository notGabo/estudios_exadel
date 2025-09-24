package org.notGabo.Controlador.TiposDeDatosFundamentales;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorArchivos {
    public String leerArchivo(String ruta) {
        String contenido;
        try {
            return new String(Files.readAllBytes(Paths.get(ruta)));
        } catch (IOException e) {
            System.err.println("Error intentando leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return java.lang.String.valueOf("Error");
    }
}