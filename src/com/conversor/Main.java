//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package com.conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║                                          ║");
            System.out.println("║    BIENVENIDO AL CONVERSOR DE MONEDA     ║");
            System.out.println("║                                          ║");
            System.out.println("╚══════════════════════════════════════════╝");
            System.out.println("         1) Dólar ⇒ Peso argentino");
            System.out.println("         2) Peso argentino ⇒ Dólar");
            System.out.println("         3) Dólar ⇒ Real brasileño");
            System.out.println("         4) Real brasileño ⇒ Dólar");
            System.out.println("         5) Dólar ⇒ Peso colombiano");
            System.out.println("         6) Peso colombiano ⇒ Dólar");
            System.out.println("         7) Salir");
            System.out.print("           Elija una opción válida: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto a convertir: ");
                double monto = scanner.nextDouble();
                convertirMoneda(opcion, monto);
            } else if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 7);

        scanner.close();
    }

    public static void convertirMoneda(int opcion, double monto) {
        // Tasas de cambio fijas
        double dolarAPesoArg = 1397.0;
        double pesoArgADolar = 1 / dolarAPesoArg;

        double dolarAReal = 5.23;
        double realADolar = 1 / dolarAReal;

        double dolarAPesoCol = 3662.0;
        double pesoColADolar = 1 / dolarAPesoCol;

        double resultado = 0;

        switch (opcion) {
            case 1 -> resultado = monto * dolarAPesoArg;
            case 2 -> resultado = monto * pesoArgADolar;
            case 3 -> resultado = monto * dolarAReal;
            case 4 -> resultado = monto * realADolar;
            case 5 -> resultado = monto * dolarAPesoCol;
            case 6 -> resultado = monto * pesoColADolar;
        }

        System.out.printf("Resultado de la conversión: %.2f\n", resultado);
    }
}