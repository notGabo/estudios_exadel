package org.notGabo.Controlador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorArchivos {
    // TODO: Cambiar esto por un valor en un archivo de configuracion en el futuro
    String RutaArchivos = "D:\\Estudios\\ObsidianVault\\Estudios\\Estudios Java\\";

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

    // fuente: https://glaforge.dev/posts/2025/02/27/pretty-print-markdown-on-the-console/
    public static String markdown(String md) {
        return md
                // Bold
                .replaceAll("\\*\\*(.*?)\\*\\*", "\u001B[1m$1\u001B[0m")
                // Italic
                .replaceAll("\\*(.*?)\\*", "\u001B[3m$1\u001B[0m")
                // Underline
                .replaceAll("__(.*?)__", "\u001B[4m$1\u001B[0m")
                // Strikethrough
                .replaceAll("~~(.*?)~~", "\u001B[9m$1\u001B[0m")
                // Blockquote
                .replaceAll("(> ?.*)",
                        "\u001B[3m\u001B[34m\u001B[1m$1\u001B[22m\u001B[0m")
                // Lists (bold magenta number and bullet)
                .replaceAll("([\\d]+\\.|-|\\*) (.*)",
                        "\u001B[35m\u001B[1m$1\u001B[22m\u001B[0m $2")
                // Block code (black on gray)
                .replaceAll("(?s)```(\\w+)?\\n(.*?)\\n```",
                        "\u001B[3m\u001B[1m$1\u001B[22m\u001B[0m\n\u001B[57;107m$2\u001B[0m\n")
                // Inline code (black on gray)
                .replaceAll("`(.*?)`", "\u001B[57;107m$1\u001B[0m")
                // Headers (cyan bold)
                .replaceAll("(#{1,6}) (.*?)\n",
                        "\u001B[36m\u001B[1m$1 $2\u001B[22m\u001B[0m\n")
                // Headers with a single line of text followed by 2 or more equal signs
                .replaceAll("(.*?\n={2,}\n)",
                        "\u001B[36m\u001B[1m$1\u001B[22m\u001B[0m\n")
                // Headers with a single line of text followed by 2 or more dashes
                .replaceAll("(.*?\n-{2,}\n)",
                        "\u001B[36m\u001B[1m$1\u001B[22m\u001B[0m\n")
                // Images (blue underlined)
                .replaceAll("!\\[(.*?)]\\((.*?)\\)",
                        "\u001B[34m$1\u001B[0m (\u001B[34m\u001B[4m$2\u001B[0m)")
                // Links (blue underlined)
                .replaceAll("!?\\[(.*?)]\\((.*?)\\)",
                        "\u001B[34m$1\u001B[0m (\u001B[34m\u001B[4m$2\u001B[0m)");
    }

    public String MarkdownToSout(String nombreArchivo) {
        String cadena = leerArchivo(RutaArchivos+nombreArchivo);
        if (cadena.equals("")) {
            return "Este archivo está vacío. Aún no he escrito nada aquí.";
        }
        return markdown(cadena);
    }
}