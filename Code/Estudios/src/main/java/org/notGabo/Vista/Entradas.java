package org.notGabo.Vista;

import java.util.Scanner;

public class Entradas {
    private Scanner scanner = new Scanner(System.in);
    public int ValidarEntradaEntero() {
        while (true) {
            try {
                int numero = scanner.nextInt();
                scanner.nextLine();
                return numero;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.nextLine();
            }
        }
    }

    public double ValidarEntradaDouble() {
        while (true) {
            try {
                double numero = scanner.nextDouble();
                scanner.nextLine();
                return numero;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                scanner.nextLine();
            }
        }
    }

    public String ValidarEntradaString() {
        while (true) {
            String entrada = scanner.nextLine();
            if (!entrada.trim().isEmpty()) {
                return entrada;
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un texto no vacío.");
            }
        }
    }

    public void cerrarScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public void ValidarEnter(){
        System.out.println("Presione Enter para continuar...");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.isEmpty()) {
                break;
            }
        }
    }
}